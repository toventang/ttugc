package com.p2082ss.ttvideoengine.p4430s;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttm.player.AbstractC86253m;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.s.c */
public final class C86633c {

    /* renamed from: a */
    public int f195251a;

    /* renamed from: b */
    public int f195252b;

    /* renamed from: c */
    public String f195253c;

    /* renamed from: d */
    public String f195254d;

    /* renamed from: e */
    public Map f195255e;

    static {
        Covode.recordClassIndex(101861);
    }

    /* renamed from: e */
    private boolean m150049e() {
        if (this.f195251a == -499897) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m150051g() {
        int i = this.f195251a;
        if (i == -499999 || i == -499997 || i == -499996 || i == -499992 || i == -499991 || i == -499990 || i == -499989 || i == -2139062143) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int mo137899b() {
        if (this.f195253c.equals("kTTVideoErrorDomainFetchingInfo")) {
            return 1000;
        }
        if (this.f195253c.equals("kTTVideoErrorDomainLocalDNS") || this.f195253c.equals("kTTVideoErrorDomainHTTPDNS")) {
            return 1001;
        }
        if (!this.f195253c.equals("kTTVideoErrorDomainVideoOwnPlayer") || !m150051g()) {
            return 1003;
        }
        return 1002;
    }

    /* renamed from: d */
    public final boolean mo137901d() {
        if (TextUtils.isEmpty(this.f195253c)) {
            return false;
        }
        if (this.f195253c.equals("kTTVideoErrorDomainVideoOwnPlayer") || this.f195253c.equals("kTTVideoErrorDomainVideoOSPlayer") || this.f195253c.equals("kTTVideoErrorDomainVideoExoPlayer")) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Object[] objArr = new Object[4];
        objArr[0] = this.f195253c;
        objArr[1] = Integer.valueOf(this.f195251a);
        objArr[2] = Integer.valueOf(this.f195252b);
        String str = this.f195254d;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return C1764a.m5928a("domain:%s, code:%d, internalCode:%d, description:%s", objArr);
    }

    /* renamed from: f */
    private boolean m150050f() {
        int i = this.f195251a;
        if (i == -499988 || i == -499987 || i == -499986 || i == -499985 || i == -499899 || i == -499898 || i == -499896 || i == -499894 || i == -499893 || i == -499891 || i == 251658241 || i == -499799 || i == -499795 || i == -499794 || i == -499793 || i == -499792) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final HashMap mo137898a() {
        HashMap hashMap = new HashMap();
        hashMap.put("domain", this.f195253c);
        hashMap.put("code", Integer.valueOf(this.f195251a));
        int i = this.f195252b;
        if (i != 0) {
            hashMap.put("internalCode", Integer.valueOf(i));
        }
        String str = this.f195254d;
        if (str != null) {
            hashMap.put("description", str);
        }
        return hashMap;
    }

    /* renamed from: c */
    public final int mo137900c() {
        if (!this.f195253c.equals("kTTVideoErrorDomainHTTPDNS") && !this.f195253c.equals("kTTVideoErrorDomainLocalDNS")) {
            if (this.f195253c.equals("kTTVideoErrorDomainFetchingInfo")) {
                return 1;
            }
            if (!this.f195253c.equals("kTTVideoErrorDomainVideoOwnPlayer") || m150050f()) {
                return 2;
            }
            if (m150051g()) {
                return 3;
            }
            if (m150049e()) {
                return 1;
            }
        }
        return 2;
    }

    /* renamed from: a */
    public static String m150048a(AbstractC86253m mVar) {
        if (mVar == null) {
            return "";
        }
        int b = mVar.mo16709b();
        if (b == 0) {
            return "kTTVideoErrorDomainVideoOSPlayer";
        }
        if (b == 1 || b == 2 || b == 3 || b == 4) {
            return "kTTVideoErrorDomainVideoOwnPlayer";
        }
        if (b != 5) {
            return "";
        }
        return "kTTVideoErrorDomainVideoExoPlayer";
    }

    public C86633c(String str, int i) {
        this(str, i, 0);
    }

    public C86633c(String str, int i, int i2) {
        this(str, i, i2, null);
    }

    /* renamed from: a */
    public static C86633c m150047a(AbstractC86253m mVar, int i, String str) {
        return new C86633c(m150048a(mVar), i, str);
    }

    public C86633c(String str, int i, String str2) {
        this(str, i, 0, str2);
    }

    public C86633c(String str, int i, int i2, String str2) {
        this.f195253c = str;
        this.f195251a = i;
        this.f195252b = i2;
        this.f195254d = str2;
        this.f195255e = new HashMap();
    }
}
