package com.p2082ss.android.ugc.aweme.prop.p3605a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.BaseAdapter;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.prop.p3606b.AbstractC65279h;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.prop.a.b */
public final class C65262b extends BaseAdapter {

    /* renamed from: a */
    public List<C75445g> f147259a = new ArrayList();

    /* renamed from: b */
    public int f147260b;

    /* renamed from: c */
    private Context f147261c;

    /* renamed from: d */
    private AbstractC65279h f147262d;

    static {
        Covode.recordClassIndex(76739);
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.prop.a.b$a */
    static class C65263a {

        /* renamed from: a */
        public View f147263a;

        /* renamed from: b */
        public RemoteImageView f147264b;

        static {
            Covode.recordClassIndex(76740);
        }

        C65263a() {
        }
    }

    public final int getCount() {
        List<C75445g> list = this.f147259a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public C65262b(Context context, AbstractC65279h hVar) {
        this.f147261c = context;
        this.f147262d = hVar;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C65263a aVar;
        if (view == null) {
            view = C1764a.m5927a(LayoutInflater.from(this.f147261c), R.layout.ab0, viewGroup, false);
            aVar = new C65263a();
            aVar.f147263a = view.findViewById(R.id.blk);
            aVar.f147264b = (RemoteImageView) view.findViewById(R.id.e9a);
            view.setTag(aVar);
        } else {
            aVar = (C65263a) view.getTag();
        }
        ((C24246a) aVar.f147264b.getHierarchy()).mo39966c(R.drawable.blb);
        C34577e.m70592a(aVar.f147264b, this.f147259a.get(i).iconUrl);
        if (this.f147259a.get(i).mIsSelect) {
            aVar.f147263a.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar.f147263a, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
        } else {
            aVar.f147263a.setVisibility(4);
        }
        return view;
    }
}
