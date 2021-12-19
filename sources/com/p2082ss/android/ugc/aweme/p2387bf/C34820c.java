package com.p2082ss.android.ugc.aweme.p2387bf;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bf.c */
public final class C34820c {

    /* renamed from: a */
    public static final boolean f82247a = false;

    /* renamed from: b */
    public static final C34820c f82248b = new C34820c();

    /* renamed from: c */
    private static File f82249c;

    private C34820c() {
    }

    static {
        Covode.recordClassIndex(41828);
    }

    /* renamed from: com.ss.android.ugc.aweme.bf.c$a */
    public static final class RunnableC34821a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f82250a;

        static {
            Covode.recordClassIndex(41829);
        }

        public RunnableC34821a(Context context) {
            this.f82250a = context;
        }

        public final void run() {
            MethodCollector.m26663i(1625);
            boolean a = SettingsManager.m29616a().mo25400a("keva_bak_sp", false);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(C34820c.m71156b(this.f82250a)));
                dataOutputStream.writeBoolean(a);
                dataOutputStream.close();
                MethodCollector.m26664o(1625);
            } catch (Throwable unused) {
                MethodCollector.m26664o(1625);
            }
        }
    }

    /* renamed from: b */
    public static File m71156b(Context context) {
        File c = m71157c(context);
        f82249c = new File(c, "keva_bak_sp_record");
        if (c.exists()) {
            c.mkdir();
        }
        File file = f82249c;
        Objects.requireNonNull(file, "null cannot be cast to non-null type java.io.File");
        return file;
    }

    /* renamed from: c */
    private static File m71157c(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: a */
    public static boolean m71155a(Context context) {
        MethodCollector.m26663i(1662);
        C89219l.m154721d(context, "");
        boolean z = f82247a;
        if (!m71156b(context).exists()) {
            MethodCollector.m26664o(1662);
            return z;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(f82249c));
            z = dataInputStream.readBoolean();
            dataInputStream.close();
        } catch (Throwable unused) {
        }
        MethodCollector.m26664o(1662);
        return z;
    }
}
