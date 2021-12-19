package com.p2082ss.android.ugc.aweme.story.record.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59174d;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59178e;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.view.widget.AnimatedImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryUploadButton */
public class StoryUploadButton extends FrameLayout implements AbstractC59178e {

    /* renamed from: a */
    public Context f174242a;

    /* renamed from: b */
    public boolean f174243b;

    /* renamed from: c */
    private TextView f174244c;

    /* renamed from: d */
    private AnimatedImageView f174245d;

    static {
        Covode.recordClassIndex(90732);
    }

    public void setText(int i) {
        this.f174244c.setText(i);
    }

    public StoryUploadButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private StoryUploadButton(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(5549);
        this.f174242a = context;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.b2d, this, true);
        this.f174245d = (AnimatedImageView) a.findViewById(R.id.c0y);
        this.f174244c = (TextView) a.findViewById(R.id.f6n);
        MethodCollector.m26664o(5549);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59178e
    /* renamed from: a */
    public final void mo96652a(boolean z, int i, List<MediaModel> list, AbstractC59174d dVar) {
        MediaModel mediaModel;
        if (!z) {
            return;
        }
        if (i == 1 || i == 3) {
            int measuredWidth = this.f174245d.getMeasuredWidth();
            if (measuredWidth <= 0) {
                measuredWidth = C71812ep.m126783a(32.0d, C63247i.f143610a);
            }
            if (list != null && list.size() > 0 && (mediaModel = list.get(0)) != null) {
                C84402a.m145174a(this.f174245d, mediaModel.f134662b, measuredWidth, measuredWidth);
            }
        }
    }
}
