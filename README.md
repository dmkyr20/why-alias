# Why (alias)
Why (alias)
It is a simple program that aims to implement the five-why rule.
Whenever you can't decide something or want to find the root of the problem, it's helpful to answer the simple 'why' question 5 times.

> "The basis of Toyota's scientific approach is to ask why five times whenever we find a problem … By repeating why five times, the nature of the problem as well as its solution becomes clear. "Taiichi Ohno

## How does it work?
Anytime you want to try this practice, just run this program, and you are ready to go.

```
❯ why Ran through a red light
Why? A:Late for work
Why? A:Woke up late
Why? A:Alarm didn't worke
Why? A:Exhausted battery
Why? A:I forgot to check it
PROBLEM: Ran through a red light
	-Late for work
		-Woke up late
			-Alarm didn't worke
				-Exhausted battery
					-I forgot to check it
ROOT CAUSE: I forgot to check it
```

## How to install
To install you have to copy the repository, then create an alias for command: `java <path to repo>/FiveQuestions.java`. Java version for this command should be 11 or above. Also, it's depends from where do you going to run the alias. There should be Console provider.
