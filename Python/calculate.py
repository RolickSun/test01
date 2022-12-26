import tkinter as tk

class Calculator:
    def __init__(self):
        # 创建窗口
        self.window = tk.Tk()
        self.window.title("Calculator")
        
        # 创建文本框，用于显示输入和计算结果
        self.text_box = tk.Entry(self.window)
        self.text_box.grid(row=0, column=0, columnspan=5)

        # 创建按钮
        self.create_button("7", 1, 0)
        self.create_button("8", 1, 1)
        self.create_button("9", 1, 2)
        self.create_button("/", 1, 3)
        self.create_button("C", 1, 4)
        self.create_button("4", 2, 0)
        self.create_button("5", 2, 1)
        self.create_button("6", 2, 2)
        self.create_button("*", 2, 3)
        self.create_button("(", 2, 4)
        self.create_button("1", 3, 0)
        self.create_button("2", 3, 1)
        self.create_button("3", 3, 2)
        self.create_button("-", 3, 3)
        self.create_button(")", 3, 4)
        self.create_button("0", 4, 0)
        self.create_button(".", 4, 1)
        self.create_button("=", 4, 2)
        self.create_button("+", 4, 3)
        # 创建按钮
    def create_button(self, text, row, column):
        button = tk.Button(self.window, text=text, width=10, command=lambda: self.process_button_press(text))
        button.grid(row=row, column=column)

    # 处理按钮点击
    def process_button_press(self, text):
        # 如果用户点击的是数字或小数点，则将其添加到文本框中
        if text in "0123456789.":
            self.text_box.insert(tk.END, text)
        # 如果用户点击的是运算符，则将其添加到文本框中
        elif text in "+-*/":
            self.text_box.insert(tk.END, " " + text + " ")
        # 如果用户点击的是左括号，则将其添加到文本框中
        elif text == "(":
            self.text_box.insert(tk.END, text)
        # 如果用户点击的是右括号，则将其添加到文本框中
        elif text == ")":
            self.text_box.insert(tk.END, text)
        # 如果用户点击的是C，则清空文本框
        elif text == "C":
            self.text_box.delete(0, tk.END)
        # 如果用户点击的是=，则计算结果并将其显示在文本框中
        elif text == "=":
            try:
                result = eval(self.text_box.get())
                self.text_box.delete(0, tk.END)
                self.text_box.insert(0, result)
            except:
                self.text_box.delete(0, tk.END)
                self.text_box.insert(0, "Error")

# 创建Calculator对象并启动消息循环
calculator = Calculator()
calculator.window.mainloop()