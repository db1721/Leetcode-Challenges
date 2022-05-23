class SOS_Calc:
    def __init__(self):
        self.min1 = [6945]
        self.min5 = [12538, 5569]
        self.hour1 = [1744, 1229]
        self.hour3 = [197]
        self.hour8 = [96]
        
        self.total = 0
        
        self.power = 134
        self.time_to_train = 36 # in seconds (was 34. idk why it went up after upgrading training camps)
        self.patriot = True
        self.state_buff = True
        
        # OLD - 62,054,848 possible power
        # OLD - 68,457,525 possible power
        # OLD - 78,552,455 possible power (after crates)
        # 5/23 - 357,400 minutes total | 1,701,904 total troops | 228,055,238 possible power
        
    def run_calc(self):
        self.sum(self.min1)
        self.sum(self.min5)
        self.sum(self.hour1)
        self.sum(self.hour3)
        self.sum(self.hour8)
        
        numbers1 = "{:,}".format(self.total)
        print(f'{numbers1} minutes total')
        
        if not self.patriot and not self.state_buff:
            temp_train = self.time_to_train
        elif self.patriot and self.state_buff:
            temp_train = (self.time_to_train * .5) * .7
        elif self.patriot:
            temp_train = self.time_to_train * .5
        elif self.state_buff:
            temp_train = self.time_to_train * .7
            
        temp = (self.total * 60)/temp_train
        temp1 = "{:,}".format(int(temp))
        power_total = temp * 134
        numbers = "{:,}".format(int(power_total))
        
        print(f'{temp1} total troops')
        print(f'{numbers} possible power')

    def sum(self, list_eval):
        if list_eval is self.min1:
            for i in list_eval:
                self.total += self.calculate(1, i)
        elif list_eval is self.min5:
            for i in list_eval:
                self.total += self.calculate(5, i)
        elif list_eval is self.hour1:
            for i in list_eval:
                self.total += self.calculate(60, i)
        elif list_eval is self.hour3:
            for i in list_eval:
                self.total += self.calculate(180, i)
        elif list_eval is self.hour8:
            for i in list_eval:
                self.total += self.calculate(480, i)
        else:
            print("Unknown list used")
                
    @staticmethod
    def calculate(multiply_by, num_to_multiply):
        total = multiply_by * num_to_multiply
        return total

calc = SOS_Calc()
calc.run_calc()
