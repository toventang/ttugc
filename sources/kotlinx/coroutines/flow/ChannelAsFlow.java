package kotlinx.coroutines.flow;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.EnumC89524ao;
import kotlinx.coroutines.flow.p4639a.AbstractC89616a;
import kotlinx.coroutines.flow.p4639a.C89619b;
import kotlinx.coroutines.p4636a.AbstractC89473f;
import kotlinx.coroutines.p4636a.AbstractC89492s;
import kotlinx.coroutines.p4636a.AbstractC89494u;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.C89133g;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4611f.p4613b.C89214g;

final class ChannelAsFlow<T> extends AbstractC89616a<T> {
    private static final AtomicIntegerFieldUpdater consumed$FU = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed");
    private final AbstractC89494u<T> channel;
    private final boolean consume;
    private volatile int consumed;

    static {
        Covode.recordClassIndex(105706);
    }

    private final void markConsumed() {
        if (this.consume && consumed$FU.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // kotlinx.coroutines.flow.p4639a.AbstractC89616a
    public final String additionalToStringProps() {
        return "channel=" + this.channel + ", ";
    }

    @Override // kotlinx.coroutines.flow.p4639a.AbstractC89616a
    public final AbstractC89494u<T> produceImpl(AbstractC89516am amVar) {
        markConsumed();
        if (this.capacity == -3) {
            return this.channel;
        }
        return super.produceImpl(amVar);
    }

    @Override // kotlinx.coroutines.flow.p4639a.AbstractC89616a
    public final AbstractC89473f<T> broadcastImpl(AbstractC89516am amVar, EnumC89524ao aoVar) {
        markConsumed();
        return super.broadcastImpl(amVar, aoVar);
    }

    @Override // kotlinx.coroutines.flow.p4639a.AbstractC89616a
    public final AbstractC89616a<T> create(AbstractC89127f fVar, int i) {
        return new ChannelAsFlow(this.channel, this.consume, fVar, i);
    }

    @Override // kotlinx.coroutines.flow.p4639a.AbstractC89616a
    public final Object collectTo(AbstractC89492s<? super T> sVar, AbstractC89124d<? super C89391z> dVar) {
        Object a = C89620b.m155547a(new C89619b(sVar), this.channel, this.consume, dVar);
        if (a == EnumC89098a.COROUTINE_SUSPENDED) {
            return a;
        }
        return C89391z.f203057a;
    }

    @Override // kotlinx.coroutines.flow.p4639a.AbstractC89616a
    public final Object collect(AbstractC89615a<? super T> aVar, AbstractC89124d<? super C89391z> dVar) {
        if (this.capacity == -3) {
            markConsumed();
            Object a = C89620b.m155547a(aVar, this.channel, this.consume, dVar);
            if (a == EnumC89098a.COROUTINE_SUSPENDED) {
                return a;
            }
        } else {
            Object collect = super.collect(aVar, dVar);
            if (collect == EnumC89098a.COROUTINE_SUSPENDED) {
                return collect;
            }
        }
        return C89391z.f203057a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.a.u<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelAsFlow(AbstractC89494u<? extends T> uVar, boolean z, AbstractC89127f fVar, int i) {
        super(fVar, i);
        this.channel = uVar;
        this.consume = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelAsFlow(AbstractC89494u uVar, boolean z, AbstractC89127f fVar, int i, int i2, C89214g gVar) {
        this(uVar, z, (i2 & 4) != 0 ? C89133g.INSTANCE : fVar, (i2 & 8) != 0 ? -3 : i);
    }
}
