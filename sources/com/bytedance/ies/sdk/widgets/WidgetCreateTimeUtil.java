package com.bytedance.ies.sdk.widgets;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89214g;

public final class WidgetCreateTimeUtil implements WidgetManager.AbstractC12240a {
    private final AbstractC89172b<Widget, C89391z> onWidgetLoadedListener;
    private final Map<String, Object> widgetCreateTimeMap;

    static {
        Covode.recordClassIndex(20452);
    }

    public WidgetCreateTimeUtil() {
        this(null, 1, null);
    }

    public final void clear() {
        this.widgetCreateTimeMap.clear();
    }

    public final void send() {
        C3868c.m9491a("ttlive_widget_create_cost_time", 0, C89041ag.m154412a(C89387v.m154943a("widget_time", this.widgetCreateTimeMap)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.bytedance.android.widget.Widget, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public WidgetCreateTimeUtil(AbstractC89172b<? super Widget, C89391z> bVar) {
        this.onWidgetLoadedListener = bVar;
        this.widgetCreateTimeMap = new HashMap();
    }

    @Override // com.bytedance.android.widget.WidgetManager.AbstractC12240a
    public final boolean needUploadTime(Widget widget) {
        Boolean bool = null;
        if (!(widget instanceof LiveRecyclableWidget)) {
            widget = null;
        }
        LiveRecyclableWidget liveRecyclableWidget = (LiveRecyclableWidget) widget;
        if (liveRecyclableWidget != null) {
            bool = Boolean.valueOf(liveRecyclableWidget.isInitialized());
        }
        return C11279p.m20023c(bool);
    }

    @Override // com.bytedance.android.widget.WidgetManager.AbstractC12240a
    public final void onLoad(Widget widget, long j) {
        Class<?> cls;
        String simpleName;
        Map<String, Object> map = this.widgetCreateTimeMap;
        if (widget != null && (cls = widget.getClass()) != null && (simpleName = cls.getSimpleName()) != null) {
            map.put(simpleName, Long.valueOf(j));
            AbstractC89172b<Widget, C89391z> bVar = this.onWidgetLoadedListener;
            if (bVar != null) {
                bVar.invoke(widget);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WidgetCreateTimeUtil(AbstractC89172b bVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : bVar);
    }
}
