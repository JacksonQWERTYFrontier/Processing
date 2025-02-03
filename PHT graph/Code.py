import board
import time
from adafruit_ms8607 import MS8607
#Variables used
i2c = board.I2C()
pht = MS8607(i2c)
#This runs the main set of code
while True:
        print(pht.pressure, ", ", (int(pht.relative_humidity * 100) / 100) ,", ",  (int(((9/5) * pht.temperature + 32) * 100)) / 100)
        time.sleep(30)
