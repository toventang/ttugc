package com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.p2912a.C46560c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.b.a */
public final class C46556a implements AbstractC46540a {

    /* renamed from: a */
    public static final C46557a f108544a = new C46557a((byte) 0);

    static {
        Covode.recordClassIndex(55143);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.i.b.a$a */
    public static final class C46557a {
        static {
            Covode.recordClassIndex(55144);
        }

        private C46557a() {
        }

        public /* synthetic */ C46557a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: b */
    public final String mo79106b() {
        return C46569d.f108583c;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final int mo79100a() {
        return C46569d.m89878b().size();
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final boolean mo79105a(String str) {
        String str2;
        if (str == null || (str2 = C46569d.m89876a().get(str)) == null || str2.length() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final Drawable mo79101a(Context context) {
        String miniCover;
        Bitmap a;
        if (context == null) {
            return null;
        }
        C46560c cVar = C46569d.f108581a;
        if (!(cVar == null || (miniCover = cVar.getMiniCover()) == null)) {
            C46562b bVar = C46569d.f108582b;
            if (bVar != null && (a = bVar.mo79167a(miniCover, true)) != null) {
                return new BitmapDrawable(context.getResources(), a);
            }
            Drawable a2 = C46569d.m89874a(context);
            if (a2 != null) {
                return a2;
            }
        }
        return C46569d.m89874a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final Drawable mo79102a(Context context, String str) {
        C46562b bVar;
        Bitmap a;
        if (context == null || str == null || str.length() == 0 || !C46569d.m89879c() || (bVar = C46569d.f108582b) == null || (a = bVar.mo79167a(C46569d.m89875a(str), true)) == null) {
            return null;
        }
        return new BitmapDrawable(context.getResources(), a);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final List<C46447a> mo79103a(int i, int i2) {
        if (!C46569d.m89879c()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        if (i < C46569d.m89878b().size()) {
            int i3 = 0;
            int i4 = 0;
            for (Map.Entry<String, String> entry : C46569d.m89878b().entrySet()) {
                if (i4 >= i && i4 < i + i2) {
                    C46447a aVar = new C46447a();
                    aVar.f108223c = entry.getKey();
                    String value = entry.getValue();
                    StringBuilder sb = new StringBuilder("file:/");
                    C46560c cVar = C46569d.f108581a;
                    if (cVar == null) {
                        C89219l.m154715b();
                    }
                    aVar.f108222b = sb.append(cVar.getPicFileDirPath()).append(File.separator).append(value).toString();
                    arrayList.add(aVar);
                }
                i4++;
                if (i4 >= i + i2) {
                    break;
                }
            }
            int size = i2 - arrayList.size();
            if (size > 0) {
                do {
                    arrayList.add(new C46447a());
                    i3++;
                } while (i3 < size);
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final void mo79104a(RemoteImageView remoteImageView, C46447a aVar) {
        boolean z;
        Bitmap a;
        if (remoteImageView != null && aVar != null) {
            String str = aVar.f108222b;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C89219l.m154721d(remoteImageView, "");
                C89219l.m154721d(aVar, "");
                if (C46569d.m89879c()) {
                    C46562b bVar = C46569d.f108582b;
                    if (bVar == null || (a = bVar.mo79167a(C46569d.m89875a(aVar.f108223c), false)) == null) {
                        C34577e.m70608b(remoteImageView, "file://" + aVar.f108222b, -1, -1);
                        return;
                    }
                    Context context = remoteImageView.getContext();
                    C89219l.m154716b(context, "");
                    remoteImageView.setImageDrawable(new BitmapDrawable(context.getResources(), a));
                }
            } else if (aVar.f108221a > 0) {
                remoteImageView.setImageResource(aVar.f108221a);
            }
        }
    }
}
