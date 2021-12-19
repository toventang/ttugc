package com.bytedance.android.livesdk.definition;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.widget.LandscapePanelBackgroundView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveDefinitionSelectionLandBgView extends LandscapePanelBackgroundView {
    static {
        Covode.recordClassIndex(9152);
    }

    public LiveDefinitionSelectionLandBgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.bytedance.android.livesdk.widget.LandscapePanelBackgroundView
    /* renamed from: b */
    public final float[] mo14651b() {
        return new float[]{0.0f, 0.27f, 0.44f, 0.63f, 0.82f, 1.0f};
    }

    @Override // com.bytedance.android.livesdk.widget.LandscapePanelBackgroundView
    /* renamed from: a */
    public final int[] mo14650a() {
        return new int[]{Color.parseColor("#00000000"), Color.parseColor("#66000000"), Color.parseColor("#99000000"), Color.parseColor("#CC000000"), Color.parseColor("#F2000000"), Color.parseColor("#FF000000")};
    }

    private /* synthetic */ LiveDefinitionSelectionLandBgView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LiveDefinitionSelectionLandBgView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
