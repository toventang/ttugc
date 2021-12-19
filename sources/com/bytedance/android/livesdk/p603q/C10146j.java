package com.bytedance.android.livesdk.p603q;

import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11443a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.q.j */
public final class C10146j {

    /* renamed from: a */
    public static final C10146j f24609a = new C10146j();

    /* renamed from: com.bytedance.android.livesdk.q.j$a */
    public interface AbstractC10147a {
        static {
            Covode.recordClassIndex(11710);
        }

        /* renamed from: a */
        void mo16988a();
    }

    private C10146j() {
    }

    static {
        Covode.recordClassIndex(11709);
    }

    /* renamed from: a */
    public static boolean m18653a(long j) {
        C6805b<Set<String>> bVar = AbstractC6804a.f16894W;
        C89219l.m154716b(bVar, "");
        Set<String> a = bVar.mo13066a();
        if (a == null || !a.contains(String.valueOf(j))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m18652a(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "send";
        } else {
            str = "cancel";
        }
        hashMap.put("click_type", str);
        C6501b.C6502a.m13948a("convenient_gift_first_popup_click").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
    }

    /* renamed from: a */
    public static void m18651a(ActivityC0218d dVar, AbstractC10147a aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        C6501b.C6502a.m13948a("shortcut_popup_show").mo12639a().mo12655b();
        C11443a aVar2 = new C11443a();
        aVar2.f27457a = aVar;
        AbstractC0952i supportFragmentManager = dVar.getSupportFragmentManager();
        C89219l.m154716b(supportFragmentManager, "");
        aVar2.show(supportFragmentManager, "FastGiftConfirmDialog");
        C6501b.C6502a.m13948a("convenient_gift_first_popup_show").mo12639a().mo12655b();
    }
}
