git branch -r 
git branch -a 
git branch -d <branc_name>
git push origin --delete <branch_name>
git branch -m <old_branch_name> <new_branch_name>
git branch -u origin/main main  /// to setup the upstream of local "main" branch -- that is it will now track the remote main branch 
git config --global -user.name 
git config --global -user.email
git remote -v 
git remote set-url origin <url(https/ssh)>
git remote add origin <url(https/ssh)>
git stash 
git stash list 
git stash pop

ssh-keygen -t rsa -b 4096 -C "<email>"	// -t => type(rsa), -b => bytes(4096), -C => comment(to identify the ssh key in case of multiple keys)
ssh-keygen -p -f ~/.ssh/id_rsa   		    // to add the passphrase to the ssh key
cat ~/.ssh/id_rsa.pub
eval "$(ssh-agent -s)"
ssh-add ~/.ssh/id_rsa
ssh-agent -k