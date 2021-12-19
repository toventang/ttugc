package com.p2082ss.ttvideoengine.p4415h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.HashMap;

/* renamed from: com.ss.ttvideoengine.h.aa */
public final class C86449aa {

    /* renamed from: a */
    private HashMap<String, C86450a> f193832a;

    static {
        Covode.recordClassIndex(101677);
    }

    /* renamed from: com.ss.ttvideoengine.h.aa$b */
    public static class C86451b {

        /* renamed from: a */
        public static final C86449aa f193836a = new C86449aa((byte) 0);

        static {
            Covode.recordClassIndex(101679);
        }
    }

    private C86449aa() {
        this.f193832a = new HashMap<>();
    }

    /* synthetic */ C86449aa(byte b) {
        this();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.h.aa$a */
    public class C86450a {

        /* renamed from: a */
        public String f193833a;

        /* renamed from: b */
        public C86505z f193834b;

        static {
            Covode.recordClassIndex(101678);
        }

        private C86450a() {
        }

        /* synthetic */ C86450a(C86449aa aaVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo137485a(String str) {
        if (TextUtils.isEmpty(str)) {
            C86641i.m150110a("VideoEventOneStorage", "storeVideoId return");
        } else {
            mo137488b(str);
        }
    }

    /* renamed from: e */
    public static String m149187e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?rk=");
        int indexOf2 = str.indexOf("&k=");
        if (indexOf == -1 || indexOf2 == -1) {
            return null;
        }
        return str.substring(indexOf + 4, indexOf2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C86450a mo137488b(String str) {
        C86450a aVar = this.f193832a.get(str);
        if (aVar == null) {
            C86641i.m150110a("VideoEventOneStorage", "getStorageContextFromMap, new context, vid:".concat(String.valueOf(str)));
            C86450a aVar2 = new C86450a(this, (byte) 0);
            this.f193832a.put(str, aVar2);
            return aVar2;
        }
        C86641i.m150110a("VideoEventOneStorage", "getStorageContextFromMap, old context, vid:".concat(String.valueOf(str)));
        return aVar;
    }

    /* renamed from: c */
    public final C86505z mo137489c(String str) {
        if (TextUtils.isEmpty(str)) {
            C86641i.m150110a("VideoEventOneStorage", "restoreOnePlay return");
            return null;
        }
        C86641i.m150113b("VideoEventOneStorage", "degrade mode, restore onePlay from context, vid:".concat(String.valueOf(str)));
        return mo137488b(str).f193834b;
    }

    /* renamed from: d */
    public final void mo137490d(String str) {
        if (TextUtils.isEmpty(str)) {
            C86641i.m150110a("VideoEventOneStorage", "removeByVideoId return");
            return;
        }
        this.f193832a.remove(str);
        C86641i.m150110a("VideoEventOneStorage", "removeByVideoId remove vid:" + str + ", map size:" + this.f193832a.size());
    }

    /* renamed from: a */
    public final void mo137487a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C86641i.m150110a("VideoEventOneStorage", "storeSessionId return");
            return;
        }
        C86450a b = mo137488b(str);
        b.f193833a = str2;
        C86641i.m150110a("VideoEventOneStorage", "storeSessionId, session id:" + b.f193833a);
    }

    /* renamed from: a */
    public final void mo137486a(String str, C86505z zVar) {
        if (TextUtils.isEmpty(str)) {
            C86641i.m150110a("VideoEventOneStorage", "storeOnePlay return");
            return;
        }
        C86641i.m150113b("VideoEventOneStorage", "storeOnePlay, vid:".concat(String.valueOf(str)));
        C86450a b = mo137488b(str);
        if (b.f193834b == null) {
            C86641i.m150110a("VideoEventOneStorage", "storeOnePlay new, vid:".concat(String.valueOf(str)));
            b.f193834b = zVar;
            return;
        }
        C86641i.m150110a("VideoEventOneStorage", "storeOnePlay store, vid:".concat(String.valueOf(str)));
        m149186a(b.f193834b, zVar);
    }

    /* renamed from: a */
    private static void m149186a(C86505z zVar, C86505z zVar2) {
        zVar.f194654x = zVar2.f194654x;
        zVar.f194447aX = zVar2.f194447aX;
        zVar.f194448aY = zVar2.f194448aY;
        zVar.f194480bD = zVar2.f194480bD;
        zVar.f194481bE = zVar2.f194481bE;
        zVar.f194482bF = zVar2.f194482bF;
        zVar.f194491bO = zVar2.f194491bO;
        zVar.f194571cp = zVar2.f194571cp;
        if (zVar2.f194407K != Integer.MIN_VALUE) {
            zVar.f194407K = zVar2.f194407K;
        }
        if (zVar2.f194408L != Integer.MIN_VALUE) {
            zVar.f194408L = zVar2.f194408L;
        }
        if (zVar2.f194484bH != -2147483648L) {
            zVar.f194484bH = zVar2.f194484bH;
        }
        if (zVar2.f194485bI != -2147483648L) {
            zVar.f194485bI = zVar2.f194485bI;
        }
        if (zVar2.f194486bJ != -2147483648L) {
            zVar.f194486bJ = zVar2.f194486bJ;
        }
        if (zVar2.f194487bK != -2147483648L) {
            zVar.f194487bK = zVar2.f194487bK;
        }
        if (zVar2.f194488bL != -2147483648L) {
            zVar.f194488bL = zVar2.f194488bL;
        }
        if (zVar2.f194489bM != -2147483648L) {
            zVar.f194489bM = zVar2.f194489bM;
        }
        if (zVar2.f194490bN != Integer.MIN_VALUE) {
            zVar.f194490bN = zVar2.f194490bN;
        }
        if (zVar2.f194496bT != -1) {
            zVar.f194496bT = zVar2.f194496bT;
        }
        zVar.f194397A += zVar2.f194397A;
        zVar.f194398B += zVar2.f194398B;
        zVar.f194437aN += zVar2.f194437aN;
        zVar.f194400D += zVar2.f194400D;
        zVar.f194401E += zVar2.f194401E;
        zVar.f194445aV += zVar2.f194445aV;
        zVar.f194614df.addAll(zVar2.f194614df);
        zVar.f194615dg.addAll(zVar2.f194615dg);
        zVar.f194616dh.addAll(zVar2.f194616dh);
        zVar.f194617di.addAll(zVar2.f194617di);
        zVar.f194618dj.addAll(zVar2.f194618dj);
        zVar.f194619dk.addAll(zVar2.f194619dk);
        zVar.f194620dl.addAll(zVar2.f194620dl);
        zVar.f194621dm.addAll(zVar2.f194621dm);
        zVar.f194622dn.addAll(zVar2.f194622dn);
        zVar.f194623do.addAll(zVar2.f194623do);
        zVar.f194630dv += zVar2.f194630dv;
        zVar.f194471av += zVar2.f194471av;
        zVar.f194435aL += zVar2.f194435aL;
        zVar.f194436aM += zVar2.f194436aM;
        zVar.f194445aV += zVar2.f194445aV;
        zVar.f194446aW += zVar2.f194446aW;
        zVar.f194449aZ += zVar2.f194449aZ;
        zVar.f194523bu += zVar2.f194523bu;
        zVar.f194524bv += zVar2.f194524bv;
        zVar.f194483bG += zVar2.f194483bG;
    }
}
