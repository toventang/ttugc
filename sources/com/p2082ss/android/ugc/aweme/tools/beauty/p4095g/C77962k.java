package com.p2082ss.android.ugc.aweme.tools.beauty.p4095g;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.EnumC77817a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4096h.C77978b;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.k */
public class C77962k implements AbstractC78055e {

    /* renamed from: a */
    private static final Keva f174903a;

    /* renamed from: c */
    public static final C77963a f174904c = new C77963a((byte) 0);

    /* renamed from: b */
    public final String f174905b;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.k$a */
    public static final class C77963a {
        static {
            Covode.recordClassIndex(91052);
        }

        private C77963a() {
        }

        public /* synthetic */ C77963a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m136184a(String str, String str2, String str3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return str + str2 + "_key_selected_album_" + str3;
        }

        /* renamed from: a */
        public static String m136185a(String str, String str2, String str3, String str4) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return str + str2 + "_composer_beauty_manual_" + str3 + '_' + str4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.k$b */
    public static final class C77964b extends C27895a<List<BeautyCategory>> {
        static {
            Covode.recordClassIndex(91053);
        }

        C77964b() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: a */
    public final void mo121649a(List<BeautyCategory> list) {
        if (list == null) {
            f174903a.erase(this.f174905b + "key_beauty_panel_data");
        } else {
            f174903a.storeString(this.f174905b + "key_beauty_panel_data", C77978b.m136237a().mo46674b(list));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: a */
    public final void mo121648a(String str, boolean z) {
        C89219l.m154721d(str, "");
        f174903a.storeBoolean(this.f174905b + "key_switch" + str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: a */
    public boolean mo110217a() {
        return f174903a.getBoolean("key_disable_all_beauty", false);
    }

    static {
        Covode.recordClassIndex(91051);
        Keva repo = Keva.getRepo("ulike_repo");
        C89219l.m154716b(repo, "");
        f174903a = repo;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: c */
    public final int mo121655c() {
        if (!C77886a.f174749f) {
            return f174903a.getInt(this.f174905b + "key_detect_female_count", 0);
        }
        C41093a.m82764b("getDetectFemaleCount no work by BeautyClearFemaleRecognize is true. return 0");
        return 0;
    }

    /* renamed from: d */
    public final boolean mo121656d() {
        Keva keva = f174903a;
        boolean z = keva.getBoolean(this.f174905b + "key_need_face_detect", false);
        if (z) {
            keva.storeBoolean(this.f174905b + "key_need_face_detect", false);
        }
        return z;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: b */
    public final List<BeautyCategory> mo121651b() {
        try {
            return (List) C77978b.m136237a().mo46671a(f174903a.getString(this.f174905b + "key_beauty_panel_data", null), new C77964b().type);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: a */
    public void mo110216a(boolean z) {
        f174903a.storeBoolean("key_disable_all_beauty", z);
    }

    public C77962k(String str) {
        C89219l.m154721d(str, "");
        this.f174905b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: a */
    public final String mo121643a(EnumC77817a aVar) {
        C89219l.m154721d(aVar, "");
        return f174903a.getString(this.f174905b + aVar.getFlag() + "_key_selected_category", null);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: a */
    public final void mo121645a(int i) {
        if (C77886a.f174749f) {
            C41093a.m82764b("saveDetectFemaleCount no work by BeautyClearFemaleRecognize is true.");
        } else {
            f174903a.storeInt(this.f174905b + "key_detect_female_count", i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: b */
    public final void mo121653b(boolean z) {
        if (z) {
            Keva keva = f174903a;
            if (!keva.getBoolean(this.f174905b + "key_need_face_detect", false)) {
                keva.storeBoolean(this.f174905b + "key_need_face_detect", true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: b */
    public final String mo121650b(EnumC77817a aVar, String str) {
        C89219l.m154721d(aVar, "");
        return f174903a.getString(this.f174905b + aVar.getFlag() + "_key_selected_beauty_" + str, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: a */
    public final String mo121644a(EnumC77817a aVar, ComposerBeauty composerBeauty) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(composerBeauty, "");
        return f174903a.getString(C77963a.m136184a(this.f174905b, aVar.getFlag(), composerBeauty.getEffect().getResourceId()), null);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: b */
    public final void mo121652b(ComposerBeauty composerBeauty, EnumC77817a aVar) {
        C89219l.m154721d(composerBeauty, "");
        C89219l.m154721d(aVar, "");
        if (composerBeauty.getExtra().getDisableCache()) {
            f174903a.storeString(C77963a.m136184a(this.f174905b, aVar.getFlag(), composerBeauty.getParentResId()), "-1");
        } else {
            f174903a.storeString(C77963a.m136184a(this.f174905b, aVar.getFlag(), composerBeauty.getParentResId()), composerBeauty.getEffect().getResourceId());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: a */
    public final void mo121646a(ComposerBeauty composerBeauty, EnumC77817a aVar) {
        C89219l.m154721d(composerBeauty, "");
        C89219l.m154721d(aVar, "");
        if (composerBeauty.getExtra().getDisableCache()) {
            f174903a.storeString(this.f174905b + aVar.getFlag() + "_key_selected_beauty_" + composerBeauty.getCategoryId(), "-1");
        } else {
            f174903a.storeString(this.f174905b + aVar.getFlag() + "_key_selected_beauty_" + composerBeauty.getCategoryId(), composerBeauty.getEffect().getEffectId());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: a */
    public final void mo121647a(EnumC77817a aVar, String str) {
        C89219l.m154721d(aVar, "");
        f174903a.storeString(this.f174905b + aVar.getFlag() + "_key_selected_category", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: b */
    public final boolean mo121654b(String str, boolean z) {
        C89219l.m154721d(str, "");
        return f174903a.getBoolean(this.f174905b + "key_switch" + str, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: a */
    public float mo110215a(ComposerBeauty composerBeauty, EnumC77817a aVar, String str, float f) {
        C89219l.m154721d(composerBeauty, "");
        C89219l.m154721d(aVar, "");
        return f174903a.getFloat(C77963a.m136185a(this.f174905b, aVar.getFlag(), composerBeauty.getEffect().getResourceId(), str), f);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e
    /* renamed from: b */
    public void mo110218b(ComposerBeauty composerBeauty, EnumC77817a aVar, String str, float f) {
        C89219l.m154721d(composerBeauty, "");
        C89219l.m154721d(aVar, "");
        String a = C77963a.m136185a(this.f174905b, aVar.getFlag(), composerBeauty.getEffect().getResourceId(), str);
        f174903a.storeFloat(a, f);
        C41093a.m82765c("saveBeautyTagValue key: " + a + " val: " + f);
    }
}
