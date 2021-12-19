package com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4287a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82745b;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b;
import com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84923a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a.c */
public final class C82737c extends AbstractC84923a<AbstractC82771b> {

    /* renamed from: a */
    private AbstractC82733a f184940a;

    /* renamed from: b */
    private final C82745b f184941b;

    static {
        Covode.recordClassIndex(96584);
    }

    public C82737c(AbstractC82733a aVar, C82745b bVar) {
        C89219l.m154721d(aVar, "");
        this.f184940a = aVar;
        this.f184941b = bVar;
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo112427a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.a9r, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C82734b(a, this.f184941b, this.f184940a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0105  */
    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112428a(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4287a.C82737c.mo112428a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
