package com.example.ussdmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ussdmobile.R
import com.example.ussdmobile.adapter.SmsAdapter
import com.example.ussdmobile.databinding.FragmentSmsBinding
import com.example.ussdmobile.model.ExpSmsMod

class SmsFragment : Fragment() {

    private lateinit var binding: FragmentSmsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSmsBinding.inflate(layoutInflater, container, false)

        binding.back.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }

        binding.rv.adapter = SmsAdapter(initList())

        return binding.root
    }

    private fun initList(): List<ExpSmsMod> {
        val list = ArrayList<ExpSmsMod>()

        list.add(ExpSmsMod("SMS 10", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.", "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi.", R.drawable.ic_10))
        list.add(ExpSmsMod("SMS 20", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.", "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi.", R.drawable.ic_20))
        list.add(ExpSmsMod("SMS 25", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.", "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi.", R.drawable.ic_25))
        list.add(ExpSmsMod("SMS 50", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.", "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi.", R.drawable.ic__0))
        list.add(ExpSmsMod("SMS 100", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.", "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi.", R.drawable.ic_100))
        list.add(ExpSmsMod("SMS 500", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.", "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi.", R.drawable.ic_500))


        return list
    }
}