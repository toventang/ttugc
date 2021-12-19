package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentPreCreateViewHolderManager */
public final class CommentPreCreateViewHolderManager {

    /* renamed from: e */
    public static final C36183a f85464e = new C36183a((byte) 0);

    /* renamed from: a */
    public int f85465a = 5;

    /* renamed from: b */
    final Map<Integer, List<RecyclerView.ViewHolder>> f85466b = new LinkedHashMap();

    /* renamed from: c */
    public final AbstractC36211ad f85467c;

    /* renamed from: d */
    public final ViewGroup f85468d;

    static {
        Covode.recordClassIndex(43443);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentPreCreateViewHolderManager$PreCreateViewHolderLegoTask */
    public final class PreCreateViewHolderLegoTask implements AbstractC58264w {
        static {
            Covode.recordClassIndex(43444);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: f */
        public final EnumC58150ad mo28606f() {
            return AbstractC58265x.m105221a(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: g */
        public final String mo28607g() {
            return "task_";
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: i */
        public final boolean mo28609i() {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: j */
        public final List mo28610j() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
        /* renamed from: b */
        public final EnumC58151ae mo28601b() {
            return EnumC58151ae.BACKGROUND;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: k */
        public final EnumC58148ab mo28611k() {
            return EnumC58148ab.DEFAULT;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: h */
        public final String mo28608h() {
            return getClass().getSimpleName();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PreCreateViewHolderLegoTask() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            MethodCollector.m26663i(10811);
            int[] a = CommentPreCreateViewHolderManager.this.f85467c.mo63363a();
            int i = 0;
            do {
                int i2 = a[i];
                int i3 = CommentPreCreateViewHolderManager.this.f85465a;
                for (int i4 = 0; i4 < i3; i4++) {
                    CommentPreCreateViewHolderManager commentPreCreateViewHolderManager = CommentPreCreateViewHolderManager.this;
                    RecyclerView.ViewHolder a2 = commentPreCreateViewHolderManager.f85467c.mo63353a(i2, CommentPreCreateViewHolderManager.this.f85468d);
                    C89219l.m154721d(a2, "");
                    synchronized (commentPreCreateViewHolderManager.f85466b) {
                        try {
                            if (commentPreCreateViewHolderManager.f85466b.get(Integer.valueOf(i2)) == null) {
                                commentPreCreateViewHolderManager.f85466b.put(Integer.valueOf(i2), C89070n.m154524c(a2));
                            } else {
                                List<RecyclerView.ViewHolder> list = commentPreCreateViewHolderManager.f85466b.get(Integer.valueOf(i2));
                                if (list == null) {
                                    C89219l.m154715b();
                                }
                                Boolean.valueOf(list.add(a2));
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(10811);
                            throw th;
                        }
                    }
                }
                i++;
            } while (i < 2);
            MethodCollector.m26664o(10811);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentPreCreateViewHolderManager$a */
    public static final class C36183a {
        static {
            Covode.recordClassIndex(43445);
        }

        private C36183a() {
        }

        public /* synthetic */ C36183a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final RecyclerView.ViewHolder mo63335a(int i) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.m26663i(9580);
        synchronized (this.f85466b) {
            try {
                List<RecyclerView.ViewHolder> list = this.f85466b.get(Integer.valueOf(i));
                viewHolder = null;
                if (list != null && list.size() > 0) {
                    viewHolder = list.get(0);
                    list.remove(viewHolder);
                }
            } finally {
                MethodCollector.m26664o(9580);
            }
        }
        return viewHolder;
    }

    public CommentPreCreateViewHolderManager(AbstractC36211ad adVar, ViewGroup viewGroup) {
        C89219l.m154721d(adVar, "");
        C89219l.m154721d(viewGroup, "");
        this.f85467c = adVar;
        this.f85468d = viewGroup;
    }
}
