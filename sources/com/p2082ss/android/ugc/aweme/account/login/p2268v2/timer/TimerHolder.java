package com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer;

import android.app.Application;
import android.util.SparseArray;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1210r;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder */
public final class TimerHolder extends AndroidViewModel {

    /* renamed from: c */
    public static final C32596a f77748c = new C32596a((byte) 0);

    /* renamed from: b */
    public final C1210r<SparseArray<Map<String, C32597b>>> f77749b = new C1210r<>();

    static {
        Covode.recordClassIndex(39368);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder$a */
    public static final class C32596a {
        static {
            Covode.recordClassIndex(39369);
        }

        private C32596a() {
        }

        public /* synthetic */ C32596a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C32597b m67088a(ActivityC0945e eVar, String str, EnumC32592i iVar) {
            SparseArray<Map<String, C32597b>> value;
            Map<String, C32597b> map;
            C89219l.m154721d(str, "");
            C89219l.m154721d(iVar, "");
            if (eVar == null || (value = ((TimerHolder) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(TimerHolder.class)).f77749b.getValue()) == null || (map = value.get(iVar.getValue())) == null) {
                return null;
            }
            return map.get(str);
        }

        /* renamed from: a */
        public static void m67089a(ActivityC0945e eVar, String str, C32597b bVar, EnumC32592i iVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(iVar, "");
            if (eVar != null) {
                C1210r<SparseArray<Map<String, C32597b>>> rVar = ((TimerHolder) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(TimerHolder.class)).f77749b;
                SparseArray<Map<String, C32597b>> value = rVar.getValue();
                if (value == null) {
                    value = new SparseArray<>();
                }
                Map<String, C32597b> map = value.get(iVar.getValue());
                if (map == null) {
                    map = new LinkedHashMap<>();
                }
                map.put(str, bVar);
                value.put(iVar.getValue(), map);
                rVar.postValue(value);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder$b */
    public static final class C32597b {

        /* renamed from: a */
        public C32308a f77750a;

        static {
            Covode.recordClassIndex(39370);
        }

        public C32597b(C32308a aVar) {
            C89219l.m154721d(aVar, "");
            this.f77750a = aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimerHolder(Application application) {
        super(application);
        C89219l.m154721d(application, "");
    }
}
