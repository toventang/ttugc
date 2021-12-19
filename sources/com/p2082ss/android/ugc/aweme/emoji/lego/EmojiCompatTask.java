package com.p2082ss.android.ugc.aweme.emoji.lego;

import android.content.Context;
import androidx.core.p034e.C0656a;
import androidx.emoji.p045a.C0877a;
import androidx.emoji.p045a.C0892e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.lego.EmojiCompatTask */
public final class EmojiCompatTask implements AbstractC58264w {

    /* renamed from: a */
    public static boolean f108605a;

    /* renamed from: b */
    public static final C46580a f108606b = new C46580a((byte) 0);

    static {
        Covode.recordClassIndex(55167);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.lego.EmojiCompatTask$a */
    public static final class C46580a {
        static {
            Covode.recordClassIndex(55168);
        }

        private C46580a() {
        }

        public /* synthetic */ C46580a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.lego.EmojiCompatTask$b */
    public static final class C46581b extends C0877a.AbstractC0882d {
        static {
            Covode.recordClassIndex(55169);
        }

        @Override // androidx.emoji.p045a.C0877a.AbstractC0882d
        /* renamed from: a */
        public final void mo3175a() {
            EmojiCompatTask.f108605a = true;
        }

        C46581b() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        if (C58195d.m105109b()) {
            return EnumC58151ae.BOOT_FINISH;
        }
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(context, "");
        C0892e eVar = new C0892e(context, new C0656a("com.google.android.gms.fonts", "com.google.android.gms", "Noto Color Emoji Compat"));
        eVar.f3199b = false;
        C89219l.m154716b(eVar, "");
        C0877a.m3053a(eVar).mo3165a(new C46581b());
    }
}
