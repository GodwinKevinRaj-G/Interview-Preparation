# Interview Preparation
This repository contains resources, code, and tips for preparing technical interviews.
---

## How to Push a Local Project to This Repository Using SSH
If you have created a local project and want to push it here, follow these steps:

### 1. Initialize Git (if not already done)
```
git init
```

### 2. Add This GitHub Repo as Remote (via SSH)
```
git remote add origin git@github.com:GodwinKevinRaj-G/Interview-Preparation.git
```

If you had previously added another remote (like a custom alias), remove it and add the correct one:
```
git remote remove origin  
git remote add origin git@github.com:GodwinKevinRaj-G/Interview-Preparation.git
```

### 3. Verify SSH Authentication
Run this to check if your SSH key is correctly set up:
```
ssh -T git@github.com
```

Expected output:
```
Hi GodwinKevinRaj-G! You've successfully authenticated, but GitHub does not provide shell access.
```

If you see this, you’re good to go.

### 4. Add Files, Commit Changes, and Push
```
git add .
git commit -m "Initial commit"
```

Then push your code to GitHub:
```
git push -u origin master
```

If your branch is named `main`, replace `master` with `main`.

### 5. Done

Your project is now pushed to the GitHub repository.

You can view it or create a pull request here:  
https://github.com/GodwinKevinRaj-G/Interview-Preparation

---

### Notes

- Make sure your SSH key is added to your GitHub account under **Settings > SSH and GPG keys**.
- You can check which branch you're on with:
  ```
  git branch
  ```
- To rename your branch from `master` to `main`, use:
  ```
  git branch -m master main
  git push -u origin main
  ```

