package com.p2082ss.android.ugc.aweme.emoji.p2906i.p2907a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2907a.p2909b.C46544a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2907a.p2910c.C46550a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2907a.p2910c.C46551b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56227c;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.a.a */
public final class C46541a implements AbstractC46540a {

    /* renamed from: a */
    private final AbstractC56227c f108519a;

    /* renamed from: b */
    private final C46544a f108520b;

    static {
        Covode.recordClassIndex(55128);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: b */
    public final String mo79106b() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final int mo79100a() {
        return C46544a.f108525b.size();
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final Drawable mo79101a(Context context) {
        if (context != null) {
            return C0643b.m2369a(context, 2131231992);
        }
        return null;
    }

    public C46541a(C46544a aVar) {
        AbstractC56227c cVar;
        C89219l.m154721d(aVar, "");
        this.f108520b = aVar;
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        if (createIIMServicebyMonsterPlugin != null) {
            cVar = createIIMServicebyMonsterPlugin.getDurationPerfMon();
        } else {
            cVar = null;
        }
        this.f108519a = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final boolean mo79105a(String str) {
        if (str == null || this.f108520b.mo79108a(str).length() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final void mo79104a(RemoteImageView remoteImageView, C46447a aVar) {
        if (remoteImageView != null && aVar != null) {
            String str = aVar.f108222b;
            if (str == null || str.length() == 0) {
                remoteImageView.setActualImageResource(R.drawable.aeh);
            } else {
                remoteImageView.setImageURI(aVar.f108222b);
            }
            Drawable drawable = remoteImageView.getDrawable();
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final Drawable mo79102a(Context context, String str) {
        Bitmap decodeBitmap;
        BitmapDrawable bitmapDrawable = null;
        if (context != null) {
            boolean z = false;
            if (!(str == null || str.length() == 0)) {
                AbstractC56227c cVar = this.f108519a;
                if (cVar != null) {
                    AbstractC56227c.C56228a.m102157a(cVar, new C46551b(str));
                }
                C46544a aVar = this.f108520b;
                C89219l.m154721d(str, "");
                if (aVar.mo79107a().get(str) == null) {
                    File file = new File(aVar.mo79108a(str));
                    if (file.exists() && (decodeBitmap = BitmapUtils.decodeBitmap(file, ((Number) C46544a.f108524a.getValue()).intValue())) != null) {
                        aVar.mo79107a().put(str, decodeBitmap);
                    }
                }
                Bitmap bitmap = aVar.mo79107a().get(str);
                if (bitmap != null) {
                    bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                }
                AbstractC56227c cVar2 = this.f108519a;
                if (cVar2 != null) {
                    C46551b bVar = new C46551b(str);
                    if (bitmapDrawable != null) {
                        z = true;
                    }
                    cVar2.mo92037a(bVar, new C46550a(z));
                }
            }
        }
        return bitmapDrawable;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final List<C46447a> mo79103a(int i, int i2) {
        int i3;
        if (i < 0 || (i3 = i2 + i) > C46544a.f108525b.size()) {
            return new ArrayList();
        }
        List<C89378p> subList = C89041ag.m154432e(C46544a.f108525b).subList(i, i3);
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) subList, 10));
        for (C89378p pVar : subList) {
            String str = (String) pVar.getFirst();
            C46447a aVar = new C46447a();
            aVar.f108223c = str;
            aVar.f108222b = this.f108520b.mo79108a(str);
            arrayList.add(aVar);
        }
        return C89070n.m154585g((Collection) arrayList);
    }
}
