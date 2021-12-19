package com.bytedance.p1777x.p1779b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.p1780c.C23697c;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.x.b.b */
public class C23683b implements Serializable, Cloneable {

    /* renamed from: a */
    private static final Pattern f56043a = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})(\\.(\\d{3}))?");
    public boolean byWrapper;
    public List<C23688g> clickList;
    public String duration;
    public List<C23684c> iconList;

    /* renamed from: id */
    public String f56044id;
    public List<C23685d> mediaFileList;
    public List<C23686e> trackingEventList;

    static {
        Covode.recordClassIndex(27785);
    }

    public long getDurationInMs() {
        if (C23697c.m44781a(this.duration)) {
            return 0;
        }
        Matcher matcher = f56043a.matcher(this.duration);
        if (!matcher.matches()) {
            return 0;
        }
        long millis = TimeUnit.HOURS.toMillis(Long.parseLong(matcher.group(1))) + 0 + TimeUnit.MINUTES.toMillis(Long.parseLong(matcher.group(2))) + TimeUnit.SECONDS.toMillis(Long.parseLong(matcher.group(3)));
        String group = matcher.group(5);
        if (!C23697c.m44781a(group)) {
            return millis + Long.parseLong(group);
        }
        return millis;
    }
}
