member=int(input("请输入总人数："))
n=0
for i in range(1,member+1):
    print("请输入第",i,"个人的体温：",end='')
    p=float(input())
    if p>=37.3:
        n+=1
print("这次统计总共",member,"个人")
print("其中有",n,"个人体温偏高，注意休息。")
