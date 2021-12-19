package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.AbstractC54232b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b */
public interface AbstractC54142b extends AbstractC1203l {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b$a */
    public interface AbstractC54143a {
        static {
            Covode.recordClassIndex(63823);
        }

        /* renamed from: a */
        void mo91256a();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b$b */
    public interface AbstractC54144b {
        static {
            Covode.recordClassIndex(63824);
        }

        /* renamed from: a */
        void mo91257a(int i);
    }

    static {
        Covode.recordClassIndex(63822);
    }

    /* renamed from: a */
    void mo91243a(C46447a aVar);

    /* renamed from: a */
    void mo91206a(AbstractC54143a aVar);

    /* renamed from: a */
    void mo91207a(AbstractC54144b bVar);

    /* renamed from: a */
    void mo91208a(AbstractView$OnClickListenerC54146d dVar);

    /* renamed from: a */
    void mo91210a(AbstractC54232b.AbstractC54233a aVar);

    /* renamed from: a */
    void mo91212a(String str);

    /* renamed from: l */
    void mo91226l();

    /* renamed from: m */
    void mo91227m();

    /* renamed from: n */
    void mo91228n();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    void onDestroy();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    void onPause();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    void onResume();

    /* renamed from: q */
    void mo91249q();

    /* renamed from: r */
    boolean mo91250r();
}
