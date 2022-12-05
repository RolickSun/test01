# test01

this is a description.
This is a test for README.md

## Git 基本版本控制
` git status `
  确定哪些文件处于哪种状态

` git init `
  初始化 Git

` git add `
` git commit -m 'first commit'`
添加并提交


## 分支与合并

### 创建一个本地分支
` git checkout -b branchname`

### 在2个分支之间切换
`git checkout prc/dev-wupx `
`git checkout master `

### 将新的本地分支作为备份
`git push -u origin branch_2 `

### 删除本地分支
` git branch -d branch_2 `
这不会让你删除尚未合并的分支

### 删除本地分支
` git branch -D branch_2`
即使尚未合并，这也会删除该分支！

### 查看分支
` git branch -a `
包括本地和远程分支

### 查看所有本地分支
` git branch`

### 查看所有远程分支
` git branch -r`

### 合并
` git checkout master `
` git merge prc/dev-wupx `
将你的分支合并到 master
