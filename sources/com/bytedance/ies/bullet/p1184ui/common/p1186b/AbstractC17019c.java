package com.bytedance.ies.bullet.p1184ui.common.p1186b;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import java.util.List;

/* renamed from: com.bytedance.ies.bullet.ui.common.b.c */
public interface AbstractC17019c extends AbstractC17046h.AbstractC17048b {
    static {
        Covode.recordClassIndex(19468);
    }

    /* renamed from: a */
    ViewGroup mo26895a();

    /* renamed from: a */
    ViewGroup mo26896a(Context context);

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    void mo25851a(Uri uri);

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    void mo25852a(Uri uri, Throwable th);

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    void mo25853a(View view, Uri uri, AbstractC16208i iVar);

    /* renamed from: a */
    void mo26897a(AbstractC16741q qVar);

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z);

    /* renamed from: b */
    C16248b mo26898b(Context context);

    /* renamed from: b */
    AbstractC17017a mo26899b();
}
