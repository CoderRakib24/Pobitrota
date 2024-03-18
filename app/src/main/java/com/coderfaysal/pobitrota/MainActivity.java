package com.coderfaysal.pobitrota;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);


        hashMap = new HashMap<>();
        hashMap.put("title", "পবিত্রতা কাকে বলে?");
        hashMap.put("message", "শরীয়ত নির্দেশিত পন্থায় পানি বা মাটি ব্যবহার করার দ্বারা যা অর্জিত হয় তাকে তহারাত বা পবিত্রতা বলে।  পবিত্রতা অর্জনের নিয়ম তিনটি – ১. অযু দ্বারা ২. গোসল দ্বারা ৩. তায়াম্মুম দ্বারা ।\n" +
                "يَا أَيُّهَا الَّذِينَ آمَنُوا إِذَا قُمْتُمْ إِلَى الصَّلَاةِ فَاغْسِلُوا وُجُوهَكُمْ وَأَيْدِيَكُمْ إِلَى الْمَرَافِقِ وَامْسَحُوا بِرُءُوسِكُمْ وَأَرْجُلَكُمْ إِلَى الْكَعْبَيْنِ ۚ وَإِنْ كُنْتُمْ جُنُبًا فَاطَّهَّرُوا ۚ وَإِنْ كُنْتُمْ مَرْضَىٰ أَوْ عَلَىٰ سَفَرٍ أَوْ جَاءَ أَحَدٌ مِنْكُمْ مِنَ الْغَائِطِ أَوْ لَامَسْتُمُ النِّسَاءَ فَلَمْ تَجِدُوا مَاءً فَتَيَمَّمُوا صَعِيدًا طَيِّبًا فَامْسَحُوا بِوُجُوهِكُمْ وَأَيْدِيكُمْ مِنْهُ ۚ مَا يُرِيدُ اللَّهُ لِيَجْعَلَ عَلَيْكُمْ مِنْ حَرَجٍ وَلَٰكِنْ يُرِيدُ لِيُطَهِّرَكُمْ وَلِيُتِمَّ نِعْمَتَهُ عَلَيْكُمْ لَعَلَّكُمْ تَشْكُرُونَ\n" +
                "“হে মুমিনগণ, যখন তোমরা নামাযের জন্যে উঠ, তখন স্বীয় মুখমন্ডল ও হস্তসমূহ কনুই পর্যন্ত ধৌত কর এবং পদযুগল গিটসহ। যদি তোমরা অপবিত্র হও তবে সারা দেহ পবিত্র করে নাও এবং যদি তোমরা রুগ্ন হও, অথবা প্রবাসে থাক অথবা তোমাদের কেউ প্রসাব-পায়খানা সেরে আসে অথবা তোমরা স্ত্রীদের সাথে সহবাস কর, অতঃপর পানি না পাও, তবে তোমরা পবিত্র মাটি দ্বারা তায়াম্মুম করে নাও-অর্থাৎ, স্বীয় মুখ-মন্ডল ও হস্তদ্বয় মাটি দ্বারা মুছে ফেল। আল্লাহ তোমাদেরকে অসুবিধায় ফেলতে চান না; কিন্তু তোমাদেরকে পবিত্র রাখতে চান এবং তোমাদের প্রতি স্বীয় নেয়ামত পূর্ণ করতে চান-যাতে তোমরা কৃতজ্ঞাতা প্রকাশ কর।” [সুরাহ মায়েদাহ আয়াত ৬]");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "অযু কাকে বলে?");
        hashMap.put("message", "ওযু / অজু (الوُضوء) আরবি শব্দ। এর শাব্দিক অর্থ হলো নির্দিষ্ট চারটি অঙ্গ ধৌত করা। ইসলামি পরিভাষায় শরীর পবিত্র করার নিয়তে পবিত্র পানি দিয়ে শরিয়তের নিয়ম অনুযায়ী নির্দিষ্ট অঙ্গপ্রত্যঙ্গ যেমন-হাত, মুখ, পা ধৌত করা ও (ভিজা হাতে) মাথা মাসাহ করাকে ওযু বলে।\n" +
                "মহান আল্লাহ বলেন-‘হে মুমিনগণ! যখন তোমরা সালাতে দণ্ডায়মান হতে চাও,তখন তোমাদের মুখ ও কনুই পর্যন্ত হাত ধৌত কর,মাথা মাসাহ কর এবং টাখনু পর্যন্ত পা (ধৌত কর) এবং যদি তোমরা অপবিত্র থাক,তবে ভালোভাবে পবিত্র হও।(সূরা আল-মায়িদাহ :৬)।\n" +
                "সুতরাং বড় নাপাকী না থাকার ফলে গোসলের দরকার না হলেও নামাযের জন্য ছোট নাপাকী থেকে পবিত্রতা অর্জনের উদ্দেশ্যে ওযু ফরয। এ ব্যাপারে মহানবী (ﷺ) বলেন, “ওযু নষ্ট হয়ে গেলে পুনরায় ওযু না করা পর্যন্ত আল্লাহ কারো নামায কবুল করেন না।”(সহীহ বুখারী, মুসলিম, সহীহ মিশকাত ৩০০)");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "পবিত্রতা অর্জনের প্রয়োজনীয়তা:");
        hashMap.put("message", "নাপাকী থেকে পবিত্রতা অর্জন করা সক্ষম ব্যক্তির উপর ওয়াজিব।\n" +
                "নামায কবুল হওয়ার জন্য যেমন বিশুদ্ধ ঈমান এবং হৃদয়কে শিরক,কুফরী ধারণা ও বিশ্বাস থেকে পবিত্র রাখা জরুরী শর্ত,ঠিক তেমনি নামাযীর বাহ্যিক দেহ্ ও পোশাক-আশাককে পবিত্র রাখাও এক জরুরী শর্ত।\n" +
                "যেহেতু “নামাযের চাবিকাঠিই হল পবিত্রতা।”(আবু দাঊদ ৬১৮, তিরমিযী ৩,তিরমিযী ৩,মিশকাত ৩১২)");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "গোসল করার নিয়ম:");
        hashMap.put("message", "নাপাকীর গোসল করতে হলে গোসলের নিয়ত করে মুসলিম প্রথমে ৩ বার দুইহাত কব্জি পর্যন্ত ধুবে। অতঃপর বাম হাতের উপর পানি ঢেলে দেহের নাপাকী ধুয়ে ফেলবে। তারপর বাম হাতকে মাটি অথবা সাবান দ্বারা ধুয়ে নামাযের জন্য ওযু করার মত পূর্ণ ওযু করবে। অবশ্য গোসলের জায়গা পরিষ্কার না হলে পা দুটি গোসল শেষে ধুয়ে নেবে। ওযুর পর ৩ বার মাথায় পানি ঢেলে ভাল করে চুলগুলো ধোবে, যাতে সমস্ত চুলের গোড়ায় গোড়ায় পানি পৌঁছে যায়। তারপর সারা দেহে ৩ বার পানি ঢেলে ভালরুপে ধুয়ে নেবে। (বুখারী, মুসলিম, মিশকাত ৪৩৫-৪৩৬ নং)\n" +
                "মহিলাদের গোসলও পুরুষদের অনুরুপ। অবশ্য মহিলার মাথার চুলে বেণী বাঁধা (চুটি গাঁথা) থাকলে তা খোলা জরুরী নয়। তবে ৩ বার পানি নিয়ে চুলের গোড়া অবশ্যই ধুয়ে নিতে হবে। (বুখারী, মিশকাত ৪৩৮নং) নখে নখপালিশ বা কোন প্রকার পুরু পেন্ট্ থাকলে তা তুলে না ফেলা পর্যন্ত গোসল হবে না। পক্ষান্তরে মেহেদী বা আলতা লেগে থাকা অবস্থায় গোসল হয়ে যাবে। কপালে টিপ (?) থাকলে ছাড়িয়ে ফেলে (কপাল) ধুতে হবে। নচেৎ গোসল হবে না।\n" +
                "বীর্যপাত বা সঙ্গম-জনিত নাপাকী ও মাসিকের গোসল, অথবা মাসিক ও ঈদ, অথবা বীর্যপাত বা সঙ্গম-জনিত নাপাকী ও জুমআ বা ঈদের গোসল নিয়ত হলে একবারই যথেষ্ট। পৃথক পৃথক গোসলের দরকার নেই। (ফিকহুস সুন্নাহ্ উর্দু ৬০পৃ: দ্র:)");
        arrayList.add(hashMap);


        XAdapter xAdapter = new XAdapter();
        recyclerView.setAdapter(xAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }


    private class XAdapter extends RecyclerView.Adapter<XAdapter.XViewHolder>{


        @NonNull
        @Override
        public XViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.items, parent, false );
            return new XViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull XViewHolder holder, int position) {

            hashMap = arrayList.get(position);
            String title = hashMap.get("title");
            String message = hashMap.get("message");

            holder.textView.setText(title);

            holder.cardView.setOnClickListener(view -> {
                Details.TITLE = title;
                Details.MESSAGE = message;
                startActivity(new Intent(MainActivity.this, Details.class));
            });


        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class XViewHolder extends RecyclerView.ViewHolder{

            TextView textView;
            CardView cardView;

            public XViewHolder(@NonNull View itemView) {
                super(itemView);

                textView = itemView.findViewById(R.id.textView);
                cardView = itemView.findViewById(R.id.cardView);
            }
        }

    }






}