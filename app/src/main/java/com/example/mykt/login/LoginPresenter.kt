package com.example.mykt.login

class LoginPresenter(var loginView: LoginView?, var loginInteracts: LoginInteracts) :
    LoginInteracts.OnLoginFinishedListener {


    fun validateCredentials(username: String, password: String) {
        loginView?.showProgress()
        loginInteracts.login(username, password, this)
    }

    fun onDestroy() {
        loginView = null
    }

    override fun onUsernameError() {
        loginView?.apply {
            setUsernameError()
            hideProgress()
        }
    }

    override fun onPasswordError() {
        loginView?.apply {
            setPasswordError()
            hideProgress()
        }
    }

    override fun onSuccess() {
        loginView?.apply {
            navigateToHome()
            hideProgress()
        }

    }

}