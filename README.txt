Файл 10m:

curl -H "Content-Type: application/json" -H "Accept: application/json" -d "{\"file_path\": \"D:/10m.txt\"}" http://localhost:8080/maxvalue
{"max_value":49999978}

curl -H "Content-Type: application/json" -H "Accept: application/xml" -d "{\"file_path\": \"D:/10m.txt\"}" http://localhost:8080/maxvalue
<MaxValResponse><max_value>49999978</max_value></MaxValResponse>

curl -H "Content-Type: application/json" -H "Accept: application/xml" -d "{\"file_path\": \"D:/10m.txt\"}" http://localhost:8080/minvalue
<MinValResponse><min_value>-49999996</min_value></MinValResponse>

curl -H "Content-Type: application/json" -H "Accept: application/json" -d "{\"file_path\": \"D:/10m.txt\"}" http://localhost:8080/medvalue
{"median":25216.0}

curl -H "Content-Type: application/json" -H "Accept: application/json" -d "{\"file_path\": \"D:/10m.txt\"}" http://localhost:8080/meanvalue
{"mean":7364.418442641844}

curl -H "Content-Type: application/json" -H "Accept: application/json" -d "{\"file_path\": \"D:/10m.txt\"}" http://localhost:8080/incr_sequence
{"longest_increasing_subsequences":[[-48190694,-47725447,-43038241,-20190291,-17190728,-6172572,8475960,25205909,48332507,48676185]]}

curl -H "Content-Type: application/json" -H "Accept: application/json" -d "{\"file_path\": \"D:/10m.txt\"}" http://localhost:8080/decr_sequence
{"longest_decreasing_subsequences":[[47689379,42381213,30043880,12102356,-4774057,-5157723,-11217378,-23005285,-23016933,-39209115,-49148762]]}

Последовательность из примера в тз:

curl -H "Content-Type: application/json" -H "Accept: application/json" -d "{\"file_path\": \"D:/test.txt\"}" http://localhost:8080/decr_sequence
{"longest_decreasing_subsequences":[[2,1],[7,1]]}

curl -H "Content-Type: application/json" -H "Accept: application/xml" -d "{\"file_path\": \"D:/test.txt\"}" http://localhost:8080/incr_sequence
<IncrSeqResponse><longest_increasing_subsequences><longest_increasing_subsequences>1</longest_increasing_subsequences><longest_increasing_subsequences>3</longest_increasing_subsequences><longest_increasing_subsequences>7</longest_increasing_subsequences><longest_increasing_subsequences>1</longest_increasing_subsequences><longest_increasing_subsequences>2</longest_increasing_subsequences><longest_increasing_subsequences>3</longest_increasing_subsequences></longest_increasing_subsequences></IncrSeqResponse>

curl -H "Content-Type: application/json" -H "Accept: application/json" -d "{\"file_path\": \"D:/test.txt\"}" http://localhost:8080/incr_sequence
{"longest_increasing_subsequences":[[1,3,7],[1,2,3]]}
