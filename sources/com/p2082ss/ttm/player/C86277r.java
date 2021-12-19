package com.p2082ss.ttm.player;

import android.content.Context;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;

/* renamed from: com.ss.ttm.player.r */
public final class C86277r {

    /* renamed from: a */
    static String f192719a;

    /* renamed from: b */
    static String f192720b = "libttmplayer.so";

    /* renamed from: c */
    static String f192721c;

    /* renamed from: d */
    static String f192722d = "ttplayer_crash.log";

    /* renamed from: e */
    static String f192723e;

    /* renamed from: f */
    private static String f192724f;

    /* renamed from: g */
    private static final SparseArray<C86280c> f192725g = new SparseArray<>();

    static {
        Covode.recordClassIndex(101454);
        m148510b(13, 1);
        m148511b(14, "999.999.999.9");
        m148511b(15, "version code:1,name:999.999.999.9default sdk info 2016-12-05");
        m148506a(0, false);
        m148506a(1, true);
        m148506a(2, true);
        m148506a(3, false);
        m148506a(4, false);
        m148506a(5, false);
        m148506a(6, false);
        m148506a(7, false);
        m148506a(8, false);
        m148510b(10, 0);
        m148506a(11, false);
        m148510b(18, 2);
        m148510b(25, 32);
    }

    /* renamed from: a */
    public static final boolean m148507a() {
        if (m148503a(6, 0) == 1) {
            return true;
        }
        if (m148503a(1, 0) == 0) {
            return false;
        }
        if (m148503a(11, 0) == 1) {
            return true;
        }
        if (m148503a(7, 0) == 1 || m148503a(8, 0) == 1 || m148503a(10, 0) >= 3) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttm.player.r$c */
    public static class C86280c {

        /* renamed from: b */
        public int f192728b = -1;

        static {
            Covode.recordClassIndex(101457);
        }

        protected C86280c(int i) {
            this.f192728b = i;
        }
    }

    /* renamed from: b */
    public static Context m148509b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: c */
    public static File m148512c(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: d */
    public static final String m148513d(Context context) {
        if (context != null && f192719a == null) {
            f192719a = m148512c(m148509b(context)).getAbsolutePath();
        }
        String str = f192724f;
        if (str != null) {
            return str;
        }
        String str2 = f192719a;
        if (str2 != null) {
            return str2;
        }
        if (context == null) {
            return null;
        }
        try {
            String absolutePath = m148512c(m148509b(context)).getAbsolutePath();
            f192719a = absolutePath;
            return absolutePath;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final String m148505a(Context context) {
        String str = f192719a;
        if (str != null) {
            return str;
        }
        if (context == null) {
            return null;
        }
        try {
            String absolutePath = m148512c(m148509b(context)).getAbsolutePath();
            f192719a = absolutePath;
            return absolutePath;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final boolean m148508a(int i) {
        C86280c cVar = f192725g.get(i);
        if (cVar == null || !(cVar instanceof C86278a) || ((C86278a) cVar).f192726a != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m148506a(int i, boolean z) {
        m148510b(i, z ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttm.player.r$a */
    public static final class C86278a extends C86280c {

        /* renamed from: a */
        public int f192726a;

        static {
            Covode.recordClassIndex(101455);
        }

        public C86278a(int i, int i2) {
            super(i);
            this.f192726a = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttm.player.r$b */
    public static class C86279b extends C86280c {

        /* renamed from: a */
        public String f192727a;

        static {
            Covode.recordClassIndex(101456);
        }

        public C86279b(int i, String str) {
            super(i);
            this.f192727a = str;
        }
    }

    /* renamed from: a */
    public static final int m148503a(int i, int i2) {
        C86280c cVar = f192725g.get(i);
        if (cVar == null || !(cVar instanceof C86278a)) {
            return i2;
        }
        return ((C86278a) cVar).f192726a;
    }

    /* renamed from: b */
    public static final void m148511b(int i, String str) {
        SparseArray<C86280c> sparseArray = f192725g;
        C86280c cVar = sparseArray.get(i);
        if (cVar != null) {
            if (cVar instanceof C86279b) {
                ((C86279b) cVar).f192727a = str;
                return;
            }
            sparseArray.remove(i);
        }
        sparseArray.append(i, new C86279b(i, str));
    }

    /* renamed from: a */
    public static final String m148504a(int i, String str) {
        if (i == 17) {
            return f192722d;
        }
        C86280c cVar = f192725g.get(i);
        if (cVar == null || !(cVar instanceof C86279b)) {
            return str;
        }
        return ((C86279b) cVar).f192727a;
    }

    /* renamed from: b */
    public static final void m148510b(int i, int i2) {
        SparseArray<C86280c> sparseArray = f192725g;
        C86280c cVar = sparseArray.get(i);
        if (cVar != null) {
            if (!(cVar instanceof C86278a)) {
                sparseArray.remove(i);
            } else if (i != 2 || !m148508a(6)) {
                ((C86278a) cVar).f192726a = i2;
                return;
            } else {
                return;
            }
        }
        sparseArray.append(i, new C86278a(i, i2));
    }
}
