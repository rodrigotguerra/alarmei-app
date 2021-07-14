package com.rodrigotguerra.alarmei.baseui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.rodrigotguerra.alarmei.R
import com.rodrigotguerra.alarmei.databinding.MainButtonBinding

class MainButton @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet?,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var title: String? = null
    private var disabledTitle: String? = null

    private var binding = MainButtonBinding.inflate(LayoutInflater.from(context), this, true)

    private var state: MainButtonState = MainButtonState.Normal
        set(value) {
            field = value
            refreshState()
        }

    private fun refreshState() {
        TODO("Not yet implemented")
    }

    init {
        setLayout()
    }

    private fun setLayout() {
        attrs?.let { attributeSet ->
            val attributes = context.obtainStyledAttributes(
                attributeSet,
                R.styleable.MainButton
            )
            setBackgroundResource(R.drawable.btn_main_selector)

            val titleResId = attributes.getResourceId(R.styleable.MainButton_btn_title, 0)
            if (titleResId != 0) title = context.getString(titleResId)

            val disabledResId = attributes.getResourceId(R.styleable.MainButton_disable_title, 0)
            if (disabledResId != 0) disabledTitle = context.getString(disabledResId)

            attributes.recycle()
        }
    }

    sealed class MainButtonState(val isEnabled: Boolean) {
        object Normal : MainButtonState(true)
        object Disabled : MainButtonState(false)
    }

}