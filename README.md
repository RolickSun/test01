# ReadMe

this is a description.
This is a test for README.md

---

## Git 基本版本控制
` git init `
  初始化 Git

` git status `
  确定哪些文件处于哪种状态

` git add ` 添加

` git commit -m 'first commit' `
提交

` git log ` 查看版本历史


## 分支与合并

### 创建一个本地分支
` git branch temp `

### 查看分支
` git branch `

` git branch -a `
包括本地和远程分支

` git branch -r `
查看所有远程分支
### 在分支之间切换
` git checkout temp `
` git checkout master `


### 删除本地分支
` git branch -d branch_2 `
这不会让你删除尚未合并的分支

` git branch -D branch_2 `
即使尚未合并，这也会删除该分支！

### 合并
` git merge prc/dev-wupx `
将其他分支合并到当前所处的分支


## 远程仓库
` git clone `拷贝远程仓库内容

` git remote -v ` 查看本地仓库与哪些远程仓库有联系

` git push `更新到远程仓库

` git fetch `将远程仓库更新到本地版本库

` git diff origin/main ` 查看本地仓库与远程仓库的区别

` git pull ` 将远程仓库整合到工作区