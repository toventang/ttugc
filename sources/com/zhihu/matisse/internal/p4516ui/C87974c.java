package com.zhihu.matisse.internal.p4516ui;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p4515c.C87951b;
import com.zhihu.matisse.internal.p4516ui.widget.DraweeViewTouch;
import com.zhihu.matisse.p4512b.AbstractC87940b;
import p4593g.p4594a.p4595a.p4596a.p4598b.AbstractC88995b;
import p4593g.p4594a.p4595a.p4596a.p4598b.C88989a;

/* renamed from: com.zhihu.matisse.internal.ui.c */
public final class C87974c extends Fragment {

    /* renamed from: a */
    public AbstractC87940b f199809a;

    static {
        Covode.recordClassIndex(103993);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f199809a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AbstractC87940b) {
            this.f199809a = (AbstractC87940b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Point point;
        super.onViewCreated(view, bundle);
        final Item item = (Item) getArguments().getParcelable("args_item");
        if (item != null) {
            View findViewById = view.findViewById(R.id.fd8);
            if (item.mo142476c()) {
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new View.OnClickListener() {
                    /* class com.zhihu.matisse.internal.p4516ui.C87974c.View$OnClickListenerC879751 */

                    static {
                        Covode.recordClassIndex(103994);
                    }

                    public final void onClick(View view) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(item.f199738c, "video/*");
                        try {
                            C87974c.this.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            Toast makeText = Toast.makeText(C87974c.this.getContext(), (int) R.string.d1a, 0);
                            if (Build.VERSION.SDK_INT == 25) {
                                C80567ic.m139657a(makeText);
                            }
                            makeText.show();
                        }
                    }
                });
            } else {
                findViewById.setVisibility(8);
            }
            DraweeViewTouch draweeViewTouch = (DraweeViewTouch) view.findViewById(R.id.bld);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.b_n);
            Uri uri = item.f199738c;
            ActivityC0945e activity = getActivity();
            ContentResolver contentResolver = activity.getContentResolver();
            Point a = C87951b.m152997a(contentResolver, uri);
            int i = a.x;
            int i2 = a.y;
            if (C87951b.m152998a(activity, contentResolver, uri)) {
                i = a.y;
                i2 = a.x;
            }
            if (i2 == 0) {
                point = new Point(1600, 1600);
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                float f = (float) displayMetrics.widthPixels;
                float f2 = (float) i;
                float f3 = f / f2;
                float f4 = (float) i2;
                float f5 = ((float) displayMetrics.heightPixels) / f4;
                if (f3 > f5) {
                    point = new Point((int) (f2 * f3), (int) (f4 * f5));
                } else {
                    point = new Point((int) (f2 * f3), (int) (f4 * f5));
                }
            }
            C24639c a2 = C24639c.m47149a(uri);
            a2.f58553d = new C24363d(point.x, point.y);
            REQUEST request = (REQUEST) a2.mo40483a();
            if (item.mo142475b()) {
                draweeViewTouch.setVisibility(4);
                simpleDraweeView.setVisibility(0);
                simpleDraweeView.setOnClickListener(new View.OnClickListener() {
                    /* class com.zhihu.matisse.internal.p4516ui.C87974c.View$OnClickListenerC879762 */

                    static {
                        Covode.recordClassIndex(103995);
                    }

                    public final void onClick(View view) {
                        if (C87974c.this.f199809a != null) {
                            C87974c.this.f199809a.mo142438b();
                        }
                    }
                });
                C24185e b = C24182c.m45843b();
                b.f57309m = simpleDraweeView.getController();
                b.f57299c = request;
                b.f57306j = true;
                simpleDraweeView.setController(b.mo39827e());
                return;
            }
            draweeViewTouch.setVisibility(0);
            simpleDraweeView.setVisibility(4);
            draweeViewTouch.setDisplayType(AbstractC88995b.EnumC88999a.FIT_TO_SCREEN);
            draweeViewTouch.setSingleTapListener(new C88989a.AbstractC88992c() {
                /* class com.zhihu.matisse.internal.p4516ui.C87974c.C879773 */

                static {
                    Covode.recordClassIndex(103996);
                }

                @Override // p4593g.p4594a.p4595a.p4596a.p4598b.C88989a.AbstractC88992c
                /* renamed from: a */
                public final void mo142511a() {
                    if (C87974c.this.f199809a != null) {
                        C87974c.this.f199809a.mo142438b();
                    }
                }
            });
            draweeViewTouch.setImageRequest(request);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.a1c, viewGroup, false);
    }
}
