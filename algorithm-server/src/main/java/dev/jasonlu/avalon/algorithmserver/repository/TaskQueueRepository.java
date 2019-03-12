package dev.jasonlu.avalon.algorithmserver.repository;

import dev.jasonlu.avalon.algorithmserver.model.TaskQueue;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskQueueRepository extends MongoRepository<TaskQueue, String> {

    public TaskQueue findByOwner(String ownerId);
}
