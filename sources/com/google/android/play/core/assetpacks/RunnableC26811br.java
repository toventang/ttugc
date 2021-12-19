package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.common.C26971b;
import com.google.android.play.core.p1963b.C26926bq;
import com.google.android.play.core.p1963b.C26958r;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.br */
final /* synthetic */ class RunnableC26811br implements Runnable {

    /* renamed from: a */
    private final C26814bu f63583a;

    /* renamed from: b */
    private final int f63584b;

    /* renamed from: c */
    private final String f63585c;

    static {
        Covode.recordClassIndex(32286);
    }

    RunnableC26811br(C26814bu buVar, int i, String str) {
        this.f63583a = buVar;
        this.f63584b = i;
        this.f63585c = str;
    }

    public final void run() {
        C26814bu buVar = this.f63583a;
        int i = this.f63584b;
        String str = this.f63585c;
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_version_code", buVar.f63593d.mo44516a());
            bundle.putInt("session_id", i);
            File[] a = buVar.mo44508a(str);
            ArrayList<String> arrayList = new ArrayList<>();
            long j = 0;
            for (File file : a) {
                j += file.length();
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                arrayList2.add(null);
                String a2 = C26958r.m53561a(file);
                bundle.putParcelableArrayList(C26926bq.m53481a("chunk_intents", str, a2), arrayList2);
                bundle.putString(C26926bq.m53481a("uncompressed_hash_sha256", str, a2), C26814bu.m53253a(file));
                bundle.putLong(C26926bq.m53481a("uncompressed_size", str, a2), file.length());
                arrayList.add(a2);
            }
            bundle.putStringArrayList(C26926bq.m53480a("slice_ids", str), arrayList);
            bundle.putLong(C26926bq.m53480a("pack_version", str), (long) buVar.f63593d.mo44516a());
            bundle.putInt(C26926bq.m53480a("status", str), 4);
            bundle.putInt(C26926bq.m53480a("error_code", str), 0);
            bundle.putLong(C26926bq.m53480a("bytes_downloaded", str), j);
            bundle.putLong(C26926bq.m53480a("total_bytes_to_download", str), j);
            bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
            bundle.putLong("bytes_downloaded", j);
            bundle.putLong("total_bytes_to_download", j);
            buVar.f63594e.post(new RunnableC26813bt(buVar, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
        } catch (C26971b e) {
            C26814bu.f63589a.mo44599e("notifyModuleCompleted failed", e);
        }
    }
}
