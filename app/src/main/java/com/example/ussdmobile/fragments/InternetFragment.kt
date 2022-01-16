package com.example.ussdmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ussdmobile.R
import com.example.ussdmobile.adapter.InternetAdapter
import com.example.ussdmobile.adapter.RecyclerAdapter
import com.example.ussdmobile.databinding.FragmentInternetBinding
import com.example.ussdmobile.model.ExpInterMod

class InternetFragment : Fragment() {

    private lateinit var binding: FragmentInternetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInternetBinding.inflate(layoutInflater, container, false)

        binding.rv.adapter = InternetAdapter(initList())

        binding.back.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }

        return binding.root
    }

    private fun initList(): List<ExpInterMod> {
        val list = ArrayList<ExpInterMod>()
        list.add(ExpInterMod("50 MB", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.", "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi.", R.drawable.ic__0))
        list.add(ExpInterMod("100 MB", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.", "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi.", R.drawable.ic_100))
        list.add(ExpInterMod("150 MB", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.", "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi.", R.drawable.ic_150))
        list.add(ExpInterMod("500 MB", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.", "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi.", R.drawable.ic_500))
        list.add(ExpInterMod("1000 MB", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.", "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi.", R.drawable.ic_1000))
        list.add(ExpInterMod("2 GB", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.", "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi.", R.drawable.ic_2_gb))


        return list
    }
}