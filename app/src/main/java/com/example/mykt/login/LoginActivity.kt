package com.example.mykt.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mykt.databinding.ActivityLoginBinding
import com.example.mykt.main.MainActivity

class LoginActivity : AppCompatActivity(), LoginView {
    private val presenter = LoginPresenter(this, LoginInteracts())
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { validateCredentials() }

    }

    private fun validateCredentials() {
        presenter.validateCredentials(
            binding.username.text.toString(),
            binding.password.text.toString()
        )
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()

    }

    override fun showProgress() {
        binding.progress.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        binding.progress.visibility = View.GONE
    }

    override fun setUsernameError() {
        binding.username.error = getString(com.example.mykt.R.string.username_error)
    }

    override fun setPasswordError() {
        binding.password.error = getString(com.example.mykt.R.string.password_error)
    }

    override fun navigateToHome() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}