package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70685k;
import com.p2082ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.p3984a.C75688a;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.m */
public final class C70691m extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> implements C70685k.AbstractC70688b {

    /* renamed from: a */
    List<? extends StickerWrapper> f158228a = new ArrayList();

    /* renamed from: b */
    public int f158229b;

    /* renamed from: c */
    private final ActivityC0218d f158230c;

    /* renamed from: d */
    private final ShortVideoContext f158231d;

    /* renamed from: e */
    private final AbstractC46415f f158232e;

    /* renamed from: f */
    private final DuetLayoutModeViewModel f158233f;

    static {
        Covode.recordClassIndex(83162);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m124933a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f158228a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        String str;
        String str2;
        C89219l.m154721d(viewHolder, "");
        C70685k kVar = (C70685k) viewHolder;
        StickerWrapper stickerWrapper = (StickerWrapper) this.f158228a.get(i);
        int i2 = 1;
        if (i == this.f158229b) {
            z = true;
        } else {
            z = false;
        }
        C89219l.m154721d(stickerWrapper, "");
        kVar.f158220b = stickerWrapper;
        if (stickerWrapper.f169181a != null) {
            AbstractC46415f fVar = kVar.f158222d;
            Effect effect = stickerWrapper.f169181a;
            if (fVar == null || !C75688a.m132805b(fVar, effect)) {
                i2 = 3;
            }
            stickerWrapper.f169183c = i2;
            kVar.mo111509a(stickerWrapper);
            Effect effect2 = stickerWrapper.f169181a;
            C89219l.m154716b(effect2, "");
            String b = C70690l.m124931b(effect2);
            if (C65350at.m117036a()) {
                Object a = C70685k.C70687a.m124928a(b);
                if (a instanceof Integer) {
                    kVar.f158219a.mo121335a(((Number) a).intValue());
                } else {
                    List<String> urlList = stickerWrapper.f169181a.getIconUrl().getUrlList();
                    if (!(urlList == null || (str2 = urlList.get(0)) == null)) {
                        kVar.f158219a.mo121338a(str2);
                    }
                }
            } else {
                List<String> urlList2 = stickerWrapper.f169181a.getIconUrl().getUrlList();
                if (!(urlList2 == null || (str = urlList2.get(0)) == null)) {
                    kVar.f158219a.mo121338a(str);
                }
            }
            kVar.f158219a.mo121340a(false);
            kVar.f158219a.setText(stickerWrapper.f169181a.getName());
            if (z) {
                kVar.mo111510a(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e5  */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.duet.C70685k.AbstractC70688b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111513a(int r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 313
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.duet.C70691m.mo111513a(int, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
            return;
        }
        Object obj = list.get(0);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        ((C70685k) viewHolder).mo111512c(((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m124933a(C70691m mVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(10063);
        C89219l.m154721d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C89219l.m154716b(from, "");
        C89219l.m154721d(from, "");
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(from, R.layout.da, viewGroup, false);
        if (a2 != null) {
            C70685k kVar = new C70685k((FrameLayout) a2, mVar.f158232e, mVar);
            try {
                if (kVar.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(kVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) kVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(kVar.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = kVar.getClass().getName();
            MethodCollector.m26664o(10063);
            return kVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.m26664o(10063);
        throw nullPointerException;
    }

    public C70691m(ActivityC0218d dVar, ShortVideoContext shortVideoContext, AbstractC46415f fVar, DuetLayoutModeViewModel duetLayoutModeViewModel) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(duetLayoutModeViewModel, "");
        this.f158230c = dVar;
        this.f158231d = shortVideoContext;
        this.f158232e = fVar;
        this.f158233f = duetLayoutModeViewModel;
    }
}
