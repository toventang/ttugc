package com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.preview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2730de.C40979n;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.utils.C80332db;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.preview.ItemFrameView */
public final class ItemFrameView extends View {

    /* renamed from: b */
    public static final C79013a f177581b = new C79013a((byte) 0);

    /* renamed from: a */
    public C80332db f177582a;

    /* renamed from: c */
    private String f177583c;

    /* renamed from: d */
    private String f177584d;

    /* renamed from: e */
    private Point f177585e;

    /* renamed from: f */
    private int f177586f;

    /* renamed from: g */
    private int f177587g;

    /* renamed from: h */
    private int f177588h;

    /* renamed from: i */
    private int f177589i;

    /* renamed from: j */
    private float f177590j;

    /* renamed from: k */
    private int f177591k;

    /* renamed from: l */
    private int f177592l;

    /* renamed from: m */
    private int f177593m;

    /* renamed from: n */
    private final Rect f177594n;

    /* renamed from: o */
    private final RectF f177595o;

    static {
        Covode.recordClassIndex(92176);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.preview.ItemFrameView$a */
    public static final class C79013a {
        static {
            Covode.recordClassIndex(92177);
        }

        private C79013a() {
        }

        public /* synthetic */ C79013a(byte b) {
            this();
        }
    }

    public final C80332db getFrameCache() {
        C80332db dbVar = this.f177582a;
        if (dbVar == null) {
            C89219l.m154710a("frameCache");
        }
        return dbVar;
    }

    public final void setFrameCache(C80332db dbVar) {
        C89219l.m154721d(dbVar, "");
        this.f177582a = dbVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0087 A[LOOP:0: B:6:0x0059->B:17:0x0087, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed A[EDGE_INSN: B:43:0x00ed->B:40:0x00ed ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r11) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.preview.ItemFrameView.onDraw(android.graphics.Canvas):void");
    }

    public ItemFrameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ItemFrameView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(6126);
        this.f177583c = "";
        this.f177584d = "video";
        this.f177585e = new Point(0, 0);
        this.f177587g = C71812ep.m126783a(30.0d, C63247i.f143610a);
        this.f177588h = C71812ep.m126783a(56.0d, C63247i.f143610a);
        this.f177589i = 1000;
        int b2 = C40979n.m82507b(getContext());
        this.f177591k = b2;
        this.f177592l = (-b2) * 2;
        this.f177593m = b2 * 2;
        this.f177594n = new Rect();
        this.f177595o = new RectF();
        MethodCollector.m26664o(6126);
    }
}
