package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel */
public final class InteractStickerViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public AbstractC1204m f163967a;

    /* renamed from: b */
    private final HashMap<String, Object> f163968b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, C33943c<C33942b>> f163969c = new HashMap<>();

    /* renamed from: d */
    private Thread f163970d;

    /* renamed from: e */
    private final Handler f163971e = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(85773);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel$a */
    public static final class RunnableC73069a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InteractStickerViewModel f163972a;

        /* renamed from: b */
        final /* synthetic */ String f163973b;

        /* renamed from: c */
        final /* synthetic */ Object f163974c;

        static {
            Covode.recordClassIndex(85774);
        }

        RunnableC73069a(InteractStickerViewModel interactStickerViewModel, String str, Object obj) {
            this.f163972a = interactStickerViewModel;
            this.f163973b = str;
            this.f163974c = obj;
        }

        public final void run() {
            this.f163972a.mo115496a(this.f163973b, this.f163974c);
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        this.f163968b.clear();
        this.f163969c.clear();
        this.f163967a = null;
    }

    /* renamed from: a */
    private final boolean m128984a() {
        if (this.f163970d == null) {
            this.f163970d = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == this.f163970d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final C33943c<C33942b> m128985b(String str) {
        C33943c<C33942b> cVar = this.f163969c.get(str);
        if (cVar == null) {
            cVar = new C33943c<>();
            if (this.f163968b.containsKey(str)) {
                cVar.setValue(new C33942b(str, this.f163968b.get(str)));
            }
            this.f163969c.put(str, cVar);
        }
        return cVar;
    }

    /* renamed from: a */
    public final <T> T mo115497a(String str) {
        C89219l.m154721d(str, "");
        T t = (T) this.f163968b.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    public final InteractStickerViewModel mo115494a(String str, AbstractC1214u<C33942b> uVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(uVar, "");
        return mo115495a(str, uVar, false);
    }

    /* renamed from: a */
    public final InteractStickerViewModel mo115496a(String str, Object obj) {
        C89219l.m154721d(str, "");
        if (!m128984a()) {
            this.f163971e.post(new RunnableC73069a(this, str, obj));
            return this;
        }
        this.f163968b.put(str, obj);
        C33943c<C33942b> cVar = this.f163969c.get(str);
        if (cVar != null) {
            cVar.setValue(new C33942b(str, obj));
        }
        return this;
    }

    /* renamed from: a */
    public final InteractStickerViewModel mo115495a(String str, AbstractC1214u<C33942b> uVar, boolean z) {
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str) && uVar != null) {
            C33943c<C33942b> b = m128985b(str);
            AbstractC1204m mVar = this.f163967a;
            if (mVar == null) {
                C89219l.m154715b();
            }
            b.mo60213a(mVar, uVar, z);
        }
        return this;
    }
}
