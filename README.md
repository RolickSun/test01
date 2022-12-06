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

` git commit -m 'first commit'`
提交

` git log ` 查看commit历史


## 分支与合并

### 创建一个本地分支
` git branch temp`

### 查看分支
` git branch`

` git branch -a `
包括本地和远程分支

` git branch -r`
查看所有远程分支
### 在分支之间切换
`git checkout temp `
`git checkout master `


### 删除本地分支
` git branch -d branch_2 `
这不会让你删除尚未合并的分支

` git branch -D branch_2`
即使尚未合并，这也会删除该分支！

### 合并
` git merge prc/dev-wupx `
将其他分支合并到当前所处的分支
