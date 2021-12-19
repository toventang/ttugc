package com.p2082ss.android.ugc.aweme.share.p3754i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.IMAdapterServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.C68054cf;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.share.C68862ag;
import com.p2082ss.android.ugc.trill.share.data.AbstractC85185b;
import com.p2082ss.android.ugc.trill.share.data.C85184a;
import com.p2082ss.android.ugc.trill.share.data.ShareDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.share.i.a */
public class C68960a {

    /* renamed from: c */
    private static volatile C68960a f154274c;

    /* renamed from: a */
    public List<C68862ag> f154275a;

    /* renamed from: b */
    public List<C68054cf> f154276b;

    /* renamed from: d */
    private ShareDatabase f154277d = ShareDatabase.m146473a(C17867d.m33078a());

    /* renamed from: e */
    private Integer f154278e;

    /* renamed from: f */
    private Integer f154279f;

    static {
        Covode.recordClassIndex(81274);
    }

    /* renamed from: b */
    public final String[] mo109507b() {
        LinkedList linkedList = new LinkedList(Arrays.asList(mo109509d()));
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return mo109505a(strArr, 10);
    }

    /* renamed from: c */
    public final long mo109508c() {
        try {
            ShareDatabase shareDatabase = this.f154277d;
            if (shareDatabase != null) {
                return shareDatabase.mo130107i().mo130112c(0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    private C68960a() {
        boolean z;
        C51423a.m95792b("I18nShareOrderUtil", "Instantiating I18nShareOrderUtil");
        StringBuilder sb = new StringBuilder("I18nShareOrderUtil instantiated, ShareDatabase ready: ");
        if (this.f154277d != null) {
            z = true;
        } else {
            z = false;
        }
        C51423a.m95792b("I18nShareOrderUtil", sb.append(z).toString());
    }

    /* renamed from: a */
    public static C68960a m121644a() {
        MethodCollector.m26663i(6870);
        if (f154274c == null) {
            synchronized (C68960a.class) {
                try {
                    if (f154274c == null) {
                        f154274c = new C68960a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6870);
                    throw th;
                }
            }
        }
        C68960a aVar = f154274c;
        MethodCollector.m26664o(6870);
        return aVar;
    }

    /* renamed from: d */
    public final String[] mo109509d() {
        String[] strArr;
        List<C68862ag> list = this.f154275a;
        if (list == null || list.isEmpty()) {
            strArr = SettingServiceImpl.m120782v().mo108857a(C17867d.m33078a()).mo90020d();
        } else {
            strArr = new String[this.f154275a.size()];
            for (int i = 0; i < this.f154275a.size(); i++) {
                strArr[i] = this.f154275a.get(i).f154008a;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(str);
        }
        if (!IMAdapterServiceImpl.m101068d().mo90129a()) {
            arrayList.remove("chat_merge");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: a */
    public final void mo109504a(String str, int i) {
        C1731i.m5640b(new CallableC68962c(this, str, i), C1731i.f5562a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Object mo109506b(String str, int i) {
        if (TextUtils.equals("more", str)) {
            return null;
        }
        try {
            ShareDatabase shareDatabase = this.f154277d;
            if (shareDatabase != null) {
                AbstractC85185b i2 = shareDatabase.mo130107i();
                i2.mo130110a(new C85184a(Long.valueOf(System.currentTimeMillis()), str, Integer.valueOf(i)));
                Integer num = this.f154279f;
                if (num != null) {
                    i2.mo130111b(num);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final String[] mo109505a(String[] strArr, int i) {
        int i2;
        try {
            if (this.f154277d != null) {
                HashMap hashMap = new HashMap();
                for (String str : strArr) {
                    hashMap.put(str, 0);
                }
                List<C85184a> a = this.f154277d.mo130107i().mo130109a(0, 100);
                if (a.size() >= 100) {
                    this.f154279f = Integer.valueOf(a.get(a.size() - 1).f190606a);
                }
                if (a.size() > i && i <= 100) {
                    a = a.subList(0, i);
                }
                for (C85184a aVar : a) {
                    Integer num = (Integer) hashMap.get(aVar.f190608c);
                    String str2 = aVar.f190608c;
                    if (num == null) {
                        i2 = 1;
                    } else {
                        i2 = num.intValue() + 1;
                    }
                    hashMap.put(str2, Integer.valueOf(i2));
                }
                Arrays.sort(strArr, new C68961b(hashMap, a));
                this.f154278e = 0;
            }
        } catch (Exception unused) {
        }
        return strArr;
    }
}
