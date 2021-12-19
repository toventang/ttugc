package com.bytedance.bpea.entry.p873a.p874a;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.common.C13397a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.entry.a.a.a */
public final class C13386a {

    /* renamed from: a */
    public static final C13387a f32683a = new C13387a((byte) 0);

    static {
        Covode.recordClassIndex(15383);
    }

    /* renamed from: com.bytedance.bpea.entry.a.a.a$a */
    public static final class C13387a {
        static {
            Covode.recordClassIndex(15384);
        }

        /* renamed from: b */
        private static void m24073b(ClipboardManager clipboardManager, ClipData clipData) {
            if (!((Boolean) C15346a.m28238a(clipboardManager, new Object[]{clipData}, 101807, "void", false, null).first).booleanValue()) {
                clipboardManager.setPrimaryClip(clipData);
                C15346a.m28240a(null, clipboardManager, new Object[]{clipData}, 101807, "com_bytedance_bpea_entry_api_clipboard_ClipboardEntry$Companion_android_content_ClipboardManager_setPrimaryClip(Landroid/content/ClipboardManager;Landroid/content/ClipData;)V");
            }
        }

        private C13387a() {
        }

        public /* synthetic */ C13387a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m24071a(ClipboardManager clipboardManager, ClipData clipData) {
            C89219l.m154721d(clipData, "");
            try {
                m24073b(clipboardManager, clipData);
            } catch (Exception e) {
                C51423a.m95784a(2, "ClipboardLancet", e.getLocalizedMessage());
            }
        }

        /* renamed from: a */
        public static void m24072a(ClipboardManager clipboardManager, ClipData clipData, PrivacyCert privacyCert) {
            C89219l.m154719c(clipboardManager, "");
            C89219l.m154719c(clipData, "");
            C13397a.C13398a.m24085c(privacyCert, "clipboard_setClip");
            m24071a(clipboardManager, clipData);
        }
    }
}
