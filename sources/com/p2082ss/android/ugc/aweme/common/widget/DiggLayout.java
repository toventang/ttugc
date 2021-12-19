package com.p2082ss.android.ugc.aweme.common.widget;

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

/* renamed from: com.ss.android.ugc.aweme.common.widget.DiggLayout */
public class DiggLayout extends FrameLayout {

    /* renamed from: f */
    public static Drawable f92407f;

    /* renamed from: a */
    public Queue<ImageView> f92408a;

    /* renamed from: b */
    public Context f92409b;

    /* renamed from: c */
    public int f92410c;

    /* renamed from: d */
    public int f92411d;

    /* renamed from: e */
    public Random f92412e;

    /* renamed from: g */
    public int f92413g;

    static {
        Covode.recordClassIndex(46799);
    }

    public DiggLayout(Context context) {
        this(context, null, (byte) 0);
    }

    public DiggLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private DiggLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(5847);
        this.f92408a = new LinkedList();
        this.f92410c = -1;
        this.f92411d = -1;
        this.f92409b = context;
        this.f92412e = new Random();
        this.f92411d = (int) C13628n.m24520b(context, 72.0f);
        this.f92410c = (int) C13628n.m24520b(context, 79.0f);
        this.f92413g = C34723i.m70928b(context);
        MethodCollector.m26664o(5847);
    }
}
