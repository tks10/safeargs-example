package com.tks10.safeargsexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_fourth.view.*
import kotlinx.android.synthetic.main.fragment_third.view.*
import kotlinx.android.synthetic.main.fragment_third.view.contentTextView
import kotlinx.android.synthetic.main.fragment_third.view.valueTextView

class FourthFragment : Fragment() {
    private val args: FourthFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myData = args.myData

        view.contentTextView.text = myData.content
        view.valueTextView.text = myData.value.toString()
        view.messageTextView.text = myData.message
    }
}
