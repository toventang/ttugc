package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout */
public class LikeLayout extends FrameLayout {

    /* renamed from: f */
    public static Drawable f131172f;

    /* renamed from: a */
    public Queue<ImageView> f131173a;

    /* renamed from: b */
    public Context f131174b;

    /* renamed from: c */
    public int f131175c;

    /* renamed from: d */
    public int f131176d;

    /* renamed from: e */
    public Random f131177e;

    /* renamed from: g */
    public int f131178g;

    static {
        Covode.recordClassIndex(67445);
    }

    public LikeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LikeLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(5323);
        this.f131173a = new LinkedList();
        this.f131175c = -1;
        this.f131176d = -1;
        this.f131174b = context;
        this.f131177e = new Random();
        this.f131176d = (int) C13628n.m24520b(context, 72.0f);
        this.f131175c = (int) C13628n.m24520b(context, 79.0f);
        this.f131178g = C34723i.m70928b(context);
        MethodCollector.m26664o(5323);
    }
}
