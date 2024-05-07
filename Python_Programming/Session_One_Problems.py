def hello_world():
	print("Hello World")
def todays_mood():
	print("🤓")

def sum(a,b):
	print(a+b)

def classify_age(age :int):
	if(age >= 18):
		print("adult")
	else:
		print("child")

from typing import List
def get_last(arr:List[int]):
	print(arr[-1])

def reverse_list(arr:List[int]):
	print(arr[::-1])

def counter(stop:int):
	count = 0
	for i in range(0, stop):
		count = count+1
		print(count)
def sum_positive_range(a :int):
	print((a * (a+1))/2)

def sum_in_range(start,stop):
	sum = 0
	for i in range(start,stop+1):
		print(i)
		sum = sum+ i
	print(sum)
def print_negative_numbers(arr:List[int]):
	for i in arr:
		if(i <0):
			print(i)
if __name__ == "__main__":
	todays_mood()
	hello_world()
	sum(1,2)
	sum("a","b")
	classify_age(18)
	classify_age(17)
	get_last([1,2,3,4,5,6])
	reverse_list([1,2,3,4,5,6])
	counter(10)
	sum_positive_range(10)
	sum_in_range(3,9)
	print_negative_numbers([3,-2,2,1,-5])