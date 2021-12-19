package com.p2082ss.android.ugc.aweme.shortvideo.local;

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
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.view.widget.AnimatedImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.local.UploadButton */
public class UploadButton extends FrameLayout implements AbstractC59178e {

    /* renamed from: a */
    private TextView f161284a;

    /* renamed from: b */
    private AnimatedImageView f161285b;

    /* renamed from: c */
    private Context f161286c;

    static {
        Covode.recordClassIndex(84520);
    }

    public void setText(int i) {
        this.f161284a.setText(i);
    }

    public UploadButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private UploadButton(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(10370);
        this.f161286c = context;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.bjf, this, true);
        this.f161285b = (AnimatedImageView) a.findViewById(R.id.c0y);
        this.f161284a = (TextView) a.findViewById(R.id.f6n);
        MethodCollector.m26664o(10370);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59178e
    /* renamed from: a */
    public final void mo96652a(boolean z, int i, List<MediaModel> list, AbstractC59174d dVar) {
        MediaModel mediaModel;
        if (!z) {
            return;
        }
        if (i == 1 || i == 3) {
            int measuredWidth = this.f161285b.getMeasuredWidth();
            if (measuredWidth <= 0) {
                measuredWidth = C71812ep.m126783a(32.0d, C63247i.f143610a);
            }
            if (list != null && list.size() > 0 && (mediaModel = list.get(0)) != null) {
                C84402a.m145166a(this.f161285b, C84896h.m145871d(mediaModel.f134662b), measuredWidth, measuredWidth);
            }
        }
    }
}
