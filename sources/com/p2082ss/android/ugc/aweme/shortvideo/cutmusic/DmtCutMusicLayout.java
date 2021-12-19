package com.p2082ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70596e;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70598f;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicLayout */
public final class DmtCutMusicLayout extends C70592b {

    /* renamed from: a */
    private C70598f f157938a;

    /* renamed from: b */
    private C70596e f157939b;

    /* renamed from: c */
    private final int f157940c;

    /* renamed from: d */
    private String f157941d;

    static {
        Covode.recordClassIndex(83050);
    }

    public DmtCutMusicLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70592b
    /* renamed from: a */
    public final void mo111353a() {
        mo111354a(0.0f);
        setTimeBubble(0);
        C70598f fVar = this.f157938a;
        if (fVar == null) {
            C89219l.m154710a("cutMusicScrollView");
        }
        fVar.setScrollDx(0.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70592b
    public final void setAudioWaveViewData(C70625d dVar) {
        C70598f fVar = this.f157938a;
        if (fVar == null) {
            C89219l.m154710a("cutMusicScrollView");
        }
        fVar.setAudioWaveViewData(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70592b
    public final void setBubbleText(String str) {
        C70596e eVar = this.f157939b;
        if (eVar == null) {
            C89219l.m154710a("bubbleTextView");
        }
        eVar.setText(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70592b
    public final void setBubbleTextViewAttribute(C70596e.C70597a aVar) {
        C89219l.m154721d(aVar, "");
        C70596e eVar = this.f157939b;
        if (eVar == null) {
            C89219l.m154710a("bubbleTextView");
        }
        eVar.setAttribute(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70592b
    public final void setScrollListener(C70598f.AbstractC70599a aVar) {
        C89219l.m154721d(aVar, "");
        C70598f fVar = this.f157938a;
        if (fVar == null) {
            C89219l.m154710a("cutMusicScrollView");
        }
        fVar.setScrollListener(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70592b
    /* renamed from: a */
    public final void mo111354a(float f) {
        C70598f fVar = this.f157938a;
        if (fVar == null) {
            C89219l.m154710a("cutMusicScrollView");
        }
        fVar.post(new C70598f.RunnableC70603e(fVar, f));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70592b
    /* renamed from: b */
    public final void mo111355b(float f) {
        C70598f fVar = this.f157938a;
        if (fVar == null) {
            C89219l.m154710a("cutMusicScrollView");
        }
        C70590a aVar = fVar.f158007O;
        if (aVar == null) {
            C89219l.m154710a("cutMusicView");
        }
        aVar.f157956c = (int) fVar.f158008P;
        aVar.f157955b = f;
        C70595d dVar = aVar.f157954a;
        dVar.f157974e = aVar.f157956c;
        dVar.f157975f = aVar.f157956c + aVar.f157957d;
        aVar.invalidate();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70592b
    public final void setTimeBubble(int i) {
        String str = this.f157941d;
        if (str == null) {
            C89219l.m154710a("bubbleText");
        }
        String a = C1764a.m5928a(str, Arrays.copyOf(new Object[]{C70612k.C70614b.m124759a((long) i)}, 1));
        C89219l.m154716b(a, "");
        setBubbleText(a);
    }

    private /* synthetic */ DmtCutMusicLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DmtCutMusicLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843173}, 0, 0);
        C89219l.m154716b(obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(0, -16777216);
        this.f157940c = color;
        obtainStyledAttributes.recycle();
        C70596e eVar = new C70596e(context, (byte) 0);
        this.f157939b = eVar;
        eVar.setId(R.id.et2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = (int) C13628n.m24520b(context, 8.0f);
        layoutParams.leftMargin = (int) C13628n.m24520b(context, 8.0f);
        layoutParams.addRule(9);
        C70596e eVar2 = this.f157939b;
        if (eVar2 == null) {
            C89219l.m154710a("bubbleTextView");
        }
        eVar2.setLayoutParams(layoutParams);
        C70596e eVar3 = this.f157939b;
        if (eVar3 == null) {
            C89219l.m154710a("bubbleTextView");
        }
        addView(eVar3);
        C70598f fVar = new C70598f(context, (byte) 0);
        this.f157938a = fVar;
        fVar.setId(R.id.ezu);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, R.id.et2);
        C70598f fVar2 = this.f157938a;
        if (fVar2 == null) {
            C89219l.m154710a("cutMusicScrollView");
        }
        fVar2.setLayoutParams(layoutParams2);
        C70598f fVar3 = this.f157938a;
        if (fVar3 == null) {
            C89219l.m154710a("cutMusicScrollView");
        }
        addView(fVar3);
        C70598f fVar4 = this.f157938a;
        if (fVar4 == null) {
            C89219l.m154710a("cutMusicScrollView");
        }
        fVar4.setWaveColor(color);
        String string = getResources().getString(R.string.b3l);
        C89219l.m154716b(string, "");
        this.f157941d = string;
    }
}
