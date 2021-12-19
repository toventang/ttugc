package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.property.C65417d;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72222k;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.CacheChooseMediaViewHolderTask */
public final class CacheChooseMediaViewHolderTask implements AbstractC33974au, AbstractC73799a {

    /* renamed from: a */
    private final Context f165676a;

    static {
        Covode.recordClassIndex(86534);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: b */
    public final boolean mo88344b() {
        return false;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        C72222k.f161904a.clear();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: a */
    public final void mo88343a() {
        MethodCollector.m26663i(9540);
        if (C65417d.m117136a()) {
            String.valueOf(System.currentTimeMillis() - System.currentTimeMillis());
            int a = C16048b.m29633a().mo25412a(true, "creative_tools_mt_album_optimization_v2_cache_viewholder", 0);
            if (a != 0) {
                Context context = this.f165676a;
                C89219l.m154721d(context, "");
                C72222k.f161905b = a;
                LayoutInflater from = LayoutInflater.from(context);
                for (int i = 0; i < a; i++) {
                    System.currentTimeMillis();
                    C72222k.f161904a.add(new MvImageChooseAdapter.C72050e(from.inflate(R.layout.a8r, (ViewGroup) null)));
                    System.currentTimeMillis();
                }
            }
        }
        MethodCollector.m26664o(9540);
    }

    public CacheChooseMediaViewHolderTask(Context context, AbstractC1196i iVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(iVar, "");
        this.f165676a = context;
        iVar.mo4012a(this);
    }
}
