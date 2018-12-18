package playground.logic;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;

//@Service
public class ThreadSafeActivityServiceStub implements ActivityService {
	private Map<String, ActivityEntity> activities;

	@PostConstruct
	public void init() {
		activities = Collections.synchronizedMap(new HashMap<>());
	}
	
	@Override
	public void cleanup() {
		this.activities.clear();
	}

	@Override
	public ActivityEntity createActivity(ActivityEntity activityEntity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActivityEntity getActivity(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActivityEntity> getAllActivities(int size, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActivityEntity> getActivitiesOfTypeAndElementId(String type, String id, int size, int page) {
		// TODO Auto-generated method stub
		return null;
	}
}