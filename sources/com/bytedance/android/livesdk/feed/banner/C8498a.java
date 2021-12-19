package com.bytedance.android.livesdk.feed.banner;

import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.banner.a */
public final class C8498a {

    /* renamed from: a */
    public ImageView f21012a;

    /* renamed from: b */
    public ImageView f21013b;

    /* renamed from: c */
    public TextView f21014c;

    /* renamed from: d */
    public List<ImageView> f21015d;

    /* renamed from: e */
    public boolean f21016e;

    /* renamed from: f */
    public final View f21017f;

    /* renamed from: g */
    public final int[] f21018g;

    static {
        Covode.recordClassIndex(9352);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.List<android.widget.ImageView> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.List<android.widget.ImageView> */
    /* JADX WARN: Multi-variable type inference failed */
    public C8498a(View view, boolean z) {
        this.f21016e = z;
        this.f21017f = view;
        this.f21014c = (TextView) view.findViewById(R.id.de9);
        this.f21012a = (ImageView) view.findViewById(R.id.de4);
        this.f21013b = (ImageView) view.findViewById(R.id.ddz);
        ArrayList arrayList = new ArrayList(3);
        this.f21015d = arrayList;
        arrayList.add(view.findViewById(R.id.o5));
        this.f21015d.add(view.findViewById(R.id.o6));
        this.f21015d.add(view.findViewById(R.id.o7));
        if (z) {
            this.f21013b.setVisibility(0);
            ImageView imageView = (ImageView) view.findViewById(R.id.ks);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = (ImageView) view.findViewById(R.id.de1);
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            this.f21014c.setTextColor(view.getContext().getResources().getColor(R.color.ws));
            this.f21014c.setTextSize(TypedValue.applyDimension(2, 24.0f, view.getContext().getResources().getDisplayMetrics()));
            for (ImageView imageView3 : this.f21015d) {
                int a = (int) C11227ap.m19885a(view.getContext(), 54.0f);
                int a2 = (int) C11227ap.m19885a(imageView3.getContext(), 10.0f);
                int a3 = (int) C11227ap.m19885a(imageView3.getContext(), 3.0f);
                imageView3.getLayoutParams().height = a;
                imageView3.getLayoutParams().width = a;
                if (imageView3.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView3.getLayoutParams();
                    layoutParams.topMargin = a3;
                    layoutParams.leftMargin = -((int) C11227ap.m19885a(view.getContext(), 8.0f));
                    imageView3.setLayoutParams(layoutParams);
                }
                imageView3.setPadding(imageView3.getPaddingLeft(), a2, imageView3.getRight(), a2);
            }
            this.f21018g = new int[]{2131234058, 2131234059, 2131234057};
            return;
        }
        this.f21018g = new int[]{2131234056, 2131234060, 2131234055};
    }
}
