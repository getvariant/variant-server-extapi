package com.variant.extapi.std.flush;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.variant.server.api.FlushableTraceEvent;
import com.variant.server.api.TraceEventFlusher;

/**
 * An implementation of {@link TraceEventFlusher}, which discards trace events.
 * 
 * @since 0.8
 *
 */
public class TraceEventFlusherNull implements TraceEventFlusher {
	
	private static final Logger LOG = LoggerFactory.getLogger(TraceEventFlusherNull.class);
		
	@Override
	public void flush(FlushableTraceEvent[] events, int size) throws Exception {
			LOG.debug(String.format("Discarded %s events.", size));
	}

}
